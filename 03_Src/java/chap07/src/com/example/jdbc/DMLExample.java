package com.example.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

public class DMLExample {

	public static void main(String[] args) throws SQLException{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password= "tiger";
		
		
		var conn = DriverManager.getConnection(url, user, password);
		conn.setAutoCommit(false);
		
		var r = new Random();
		
		
		var pSelect = conn.prepareStatement("""
					select count(*) 
					  from random
					 where no = ? 
				""");
		
		var pInsert = conn.prepareStatement("""
					insert into random values(?, 1) 
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
		
		for (int i =0; i<7000; i++) {
			int sequence = r.nextInt(1, 1001);
			pSelect.setInt(1, sequence);
			var rs = pSelect.executeQuery();
			rs.next();
			
			if(rs.getInt(1)==0) {	// insert
					pInsert.setInt(1, sequence);
					pInsert.executeUpdate();
			} else {				// update
					pUpdate.setInt(1, sequence);
					pUpdate.setInt(2, sequence);
					pUpdate.executeUpdate();
			}
		}
		
		
		conn.commit();
		conn.close();
		
		System.out.println("End...");

	}

}
