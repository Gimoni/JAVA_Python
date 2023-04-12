package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

import com.example.jdbc.AlphaSortExample.Alpha;

import util.Color;
import util.VT100;

public class AlphaSortExample2 {


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
	
	static void print1() throws SQLException, InterruptedException {
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
			
			Thread.sleep(1);
		}

		rs.close();
		stmt.close();
		
		rs.next();

		int no = 0;
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
		

			
			var rs2 = stmt.executeQuery("select count(*) from alpha");
			rs2.next();
			int count = rs2.getInt(1);
			if (count==800) 
				break;
				
		}


		

	
	
	public static void main(String[] args) throws SQLException, InterruptedException {
		VT100.reset();
		VT100.clearScreen();
		
		conn = DriverManager.getConnection(url, user, password);
		
		conn.setAutoCommit(false);
		
		var r = new Random();
		var a = new Alpha();
		
		var stmt = conn.createStatement();
		
			print1();
			
			conn.commit();
			conn.close();
			VT100.reset();
			VT100.clearScreen();

			VT100.reset();
			VT100.cursorMove(45, 1);
			System.out.println("Program End.. I do not know about my code at all.. ");

		}

	
}