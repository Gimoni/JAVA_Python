package com.example.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import util.VT100;

public class AlphaSelectExample {

	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "scott";
	static String password = "tiger";
	
	public static void main(String[] args) throws SQLException {
		
		VT100.reset();
		VT100.clearScreen();

		var conn = DriverManager.getConnection(url, user, password);
		
		var stmt = conn.createStatement();
		
		var rs = stmt.executeQuery(
				"""
				
					select * 			
					  from alpha
					 order by no asc
				"""
				);
		
		while(rs.next()) {
			int line = rs.getInt("line");
			int column = rs.getInt("col");
			char ch = rs.getString("ch").charAt(0);
			
//			System.out.printf("[%02d, %d, '%c']\n", line, column, ch);
			VT100.cursorMove(line, column);
			VT100.print(ch);
			
		}
		
		rs.close(); // resource 종료. 
		stmt.close();
		conn.close();	// connection 종료. 
		
		VT100.reset();
		VT100.cursorMove(21, 1);
		System.out.println("Program End...");
	}
}
