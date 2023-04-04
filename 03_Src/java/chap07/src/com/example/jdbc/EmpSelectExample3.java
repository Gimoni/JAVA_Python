package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpSelectExample3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("oracle.jdbc.OracleDriver");
		// sqlplus scott/tiger 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Statement stmt =  conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		rs.next();

		
		while(rs.next()) {
			int empno 		= rs.getInt("empno");
			String ename 	= rs.getString("ename"); 
			String gender 	= rs.getString("gender"); 
			String job		= rs.getString("job");
//			int mgr 		= rs.getInt("mgr");
			Integer mgr 	= rs.getObject("mgr", Integer.class);
			String hiredate = rs.getString("hiredate");
			double sal 		= rs.getDouble("sal");
			Double comm 	= rs.getObject("comm", Double.class);
			Integer deptno 	= rs.getObject("deptno", Integer.class);
			
//			System.out.println(deptno);
//			System.out.println(comm);
//			System.out.println(sal);
//			System.out.println(hiredate.substring(0, 10));
//			System.out.println(mgr);
			System.out.printf("%4d %10s %2s %5s %4s %10s %7.2f %7s %4s\n",
								empno,
								ename,
								gender,
								job,
								mgr,
								hiredate.substring(0, 10),
								sal,
								comm,
								deptno
								);
			
			
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		
		
		
		System.out.println("Program End...");
	
	}

}
