package com.example.controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.mapper.AlphaMapper;

import util.Alpha;
import util.Oracle;

public class AlphaController {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = Oracle.getInstance();
		conn.setAutoCommit(false);
		
		AlphaMapper mapper = new AlphaMapper(conn);
		
//		Alpha[] alphas = mapper.selectAll();
//		mapper.deleteAll();
		Alpha a = new Alpha();
		a.setNo(200);
		a.setLine(2);
		a.setColumn(27);
		mapper.updateAlphaByLineColumn(a);
		
//		for (var a : alphas)
//			System.out.println(a);
		
		conn.commit();
		conn.close();
		
		System.out.println("End...");

	}

}
