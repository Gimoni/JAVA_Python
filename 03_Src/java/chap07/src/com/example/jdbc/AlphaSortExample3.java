package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

import com.example.jdbc.AlphaSortExample.Alpha;

import util.Color;
import util.VT100;

public class AlphaSortExample3 {


	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "scott";
	static String password = "tiger";
	
	static Connection conn;
	
	static Random r = new Random();
	
	static class Alpha {
		
		int line; 
		int column;
		Color fg;
		Color bg;
		char ch;
		
		public Alpha() {
			line = r.nextInt(1, 21);
			column = r.nextInt(1, 21);
			do {
				fg = Color.values()[r.nextInt(8)];
				bg = Color.values()[r.nextInt(8)];
			}while (fg==bg);
			ch = (char)r.nextInt('A', 'Z'+1);
		}
		
	}
	
	static void print1() throws SQLException {

		var stmt = conn.createStatement();

		var rs = stmt.executeQuery("""	
				select * 
		  		  from alpha
		         order by line asc, col asc, fg asc, bg asc
				""");
		

		while (rs.next()) {
			int line = rs.getInt("line");
			int column = rs.getInt("col");
			Color fg = Color.valueOf(rs.getString("fg"));
			Color bg = Color.valueOf(rs.getString("bg"));
			char ch = rs.getString("ch").charAt(0);

			
			VT100.cursorMove(line + 3, column );
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
		}

		rs.close();
		stmt.close();

	}
	
	
	public static void main(String[] args) throws SQLException, InterruptedException {
		VT100.reset();
		VT100.clearScreen();
		
		conn = DriverManager.getConnection(url, user, password);
		
		conn.setAutoCommit(false);
		
		var r = new Random();
		var a = new Alpha();
		
		var stmt = conn.createStatement();
		
		var pSelect = conn.prepareStatement("""
				select count(*) 
				  from random
				 where no = ? 
			""");
	
		var pInsert = conn.prepareStatement("""
					insert into random values(?, ?, ?, ?, ?, ?) 
				""");
		
		var pUpdate = conn.prepareStatement("""
					update random
					   set cnt= (select cnt from random where no = ?) + 1 
					 where no = ? 
			""");
		
		var pDelete = conn.prepareStatement("""
				delete from random
		""");
		
		pDelete.executeUpdate();
		
		VT100.reset();
		VT100.clearScreen();
		
		int no = r.nextInt(1, 1000);
		for (;;) {
//			System.out.println(sequence);
//			pSelect.setInt(1, a.line);
//			pSelect.setInt(2, a.column);
			
		

			
			var rs = pSelect.executeQuery("""	
							select * 
					  		  from alpha
					         order by line asc, col asc, fg asc, bg asc
							""");
			while(rs.next()){
				a.line = rs.getInt("line");
				a.column = rs.getInt("col");
				a.fg = Color.valueOf(rs.getString("fg"));
				a.bg = Color.valueOf(rs.getString("bg"));
				a.ch = rs.getString("ch").charAt(0);
	
				VT100.cursorMove(a.line+3, a.column);
				VT100.setForeground(a.fg);
				VT100.setBackground(a.bg);
				VT100.print(a.ch);
				
				Thread.sleep(1);
			}
			
			rs.close();
			stmt.close();

			rs.next();

			if(rs.getInt(1)==0) {	// insert
				pInsert.setInt(1, no++);
			    pInsert.setInt(2, r.nextInt(a.line));
			    pInsert.setInt(3, r.nextInt(a.column));
			    pInsert.setString(4, a.fg.toString());
			    pInsert.setString(5, a.bg.toString());
			    pInsert.setString(6, Character.toString(a.ch));
				pInsert.executeUpdate();
				} else {
					a.line = r.nextInt(1, 21);
					a.column = r.nextInt(1, 21);
					do {
						a.fg = Color.values()[r.nextInt(8)];
						a.bg = Color.values()[r.nextInt(8)];
					}while (a.fg==a.bg);
					a.ch = (char)r.nextInt('A', 'Z'+1);
			
					pUpdate.setInt(1, no++);
				    pUpdate.setInt(2, r.nextInt(a.line));
				    pUpdate.setInt(3, r.nextInt(a.column));
				    pUpdate.setString(4, a.fg.toString());
				    pUpdate.setString(5, a.bg.toString());
				    pUpdate.setString(6, Character.toString(a.ch));
				    pUpdate.executeUpdate();
				}
			

				
				Thread.sleep(1);
				
				var rs2 = stmt.executeQuery("select count(*) from alpha");
				rs2.next();
				int count = rs2.getInt(1);
				if (count==800) 
					break;
			
				VT100.reset();
				VT100.clearScreen();
				VT100.cursorMove(1, 1);
				System.out.println("insertcount : " + no);
				System.out.println("updatecount : " + count);

				VT100.cursorMove(a.line+3, a.column + 45);
				VT100.setForeground(a.fg);
				VT100.setBackground(a.bg);
				VT100.print(a.ch);

			}
			
			conn.commit();
			conn.close();
			VT100.reset();
			VT100.clearScreen();

			VT100.reset();
			VT100.cursorMove(45, 1);
			System.out.println("Program End.. I do not know about my code at all.. ");

		}

	
}