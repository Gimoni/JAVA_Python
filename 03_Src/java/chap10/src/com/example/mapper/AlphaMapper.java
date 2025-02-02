package com.example.mapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.Alpha;
import util.Color;

public class AlphaMapper {
	Connection conn;
	
	public AlphaMapper(Connection conn) {
		this.conn = conn;
	}
	
	public int selectCountAll() {
		String sql = """
				select count(*) as count
				  from alpha
				""";
		int rtn=0;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			rs.next();
			rtn = rs.getInt("count");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rtn;
	}
	
	public int selectCountByLineColumn(int line, int column) {
		String sql = """
				select count(*) as count
				  from alpha
				 where line = ? and col = ? 
				""";
		int rtn=0;
		
		try (var pstmt = conn.prepareStatement(sql); ) {
			pstmt.setInt(1, line);
			pstmt.setInt(2, column);
			var rs = pstmt.executeQuery();
			
			rs.next();
			rtn = rs.getInt("count");
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rtn;
	}
	
	public Alpha[] selectAll(String orderby) {
		String sql = """
				select *
				  from alpha
		          order by 
				""";
		sql = sql + orderby;
		
		Alpha[] alphas = new Alpha[800];
		
		try (var stmt = conn.createStatement();
			 var rs = stmt.executeQuery(sql);) {

			for (int i=0; rs.next(); i++) {
				int no = rs.getInt("no");
				int line = rs.getInt("line");
				int column = rs.getInt("col");
				Color fg = Color.valueOf(rs.getString("fg"));
				Color bg = Color.valueOf(rs.getString("bg"));
				char ch = rs.getString("ch").charAt(0);
				
				alphas[i] = new Alpha(no, line, column, fg, bg, ch);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return alphas;
	}
	
	public int insertAlpha(Alpha alpha) {
		String sql = """
				insert into alpha
				(no, line, col, fg, bg, ch)
				values
				(?, ?, ?, ?, ?, ?)
				""";
				
		int rtn = 0;
		
		try (var pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, alpha.getNo());
			pstmt.setInt(2, alpha.getLine());
			pstmt.setInt(3, alpha.getColumn());
			pstmt.setString(4, alpha.getFg().toString());
			pstmt.setString(5, alpha.getBg().toString());
			pstmt.setString(6, alpha.getCh()+"");
			rtn = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rtn;
	}
	
	public int updateAlphaByLineColumn(Alpha alpha) {
		String sql = """
				update alpha
				   set no = ?,
				       fg = ?,
				       bg = ?,
				       ch = ?
				 where line = ? and col = ?      
				""";
		int rtn = 0;

		try (var pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, alpha.getNo());
			pstmt.setString(2, alpha.getFg().toString());
			pstmt.setString(3, alpha.getBg().toString());
			pstmt.setString(4, alpha.getCh()+"");
			pstmt.setInt(5, alpha.getLine());
			pstmt.setInt(6, alpha.getColumn());
			rtn = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rtn;
	}
	
	public int deleteAll() {
		String sql = """
				delete from alpha
				""";
		int rtn = 0;
		
		try (var stmt = conn.createStatement();){
			rtn = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rtn;
	}

}
