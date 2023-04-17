package com.example.controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.mapper.AlphaMapper;

import util.Alpha;
import util.Oracle;

public class AlphaController2 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = Oracle.getInstance();
		conn.setAutoCommit(false);
		
		AlphaMapper mapper = new AlphaMapper(conn);
		
		mapper.deleteAll();
		
		for (int i=0;;i++) {
			Alpha a = new Alpha();
			a.setNo(i);
			
			int rows = mapper.selectCountByLineColumn(a.getLine(), a.getColumn());
			if (rows==0) {
				// insert
				mapper.insertAlpha(a);
			} else {
				// update
				mapper.updateAlphaByLineColumn(a);
			}
			
			int count = mapper.selectCountAll();
			if (count==800)
				break;

//			System.out.println(a);
		}
		
		Alpha[] alphas = mapper.selectAll("""
				select *
				  from alpha
				 order by line, col desc
				""");
		
		for (var a : alphas)
			System.out.println(a);
		
		
		conn.commit();
		conn.close();
		
		System.out.println("End...");

	}

}
