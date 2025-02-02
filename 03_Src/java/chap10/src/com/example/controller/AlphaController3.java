package com.example.controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.mapper.AlphaMapper;

import util.Alpha;
import util.Oracle;
import util.VT100;

public class AlphaController3 {

	public static void main(String[] args) throws SQLException {
		VT100.reset();
		VT100.clearScreen();
		
		Connection conn = Oracle.getInstance();
		conn.setAutoCommit(false);
		
		AlphaMapper mapper = new AlphaMapper(conn);
		
		mapper.deleteAll();
		
		int insertCount = 0;
		int updateCount = 0;
		
		for (int i=0;;i++) {
			Alpha a = new Alpha();
			a.setNo(i);
			
			int rows = mapper.selectCountByLineColumn(a.getLine(), a.getColumn());
			if (rows==0) {
				// insert
				mapper.insertAlpha(a);
				insertCount++;
				VT100.cursorMove(1, 1);
				VT100.print(String.format("insertCount = %04d", insertCount));
			} else {
				// update
				mapper.updateAlphaByLineColumn(a);
				updateCount++;
				VT100.cursorMove(2, 1);
				VT100.print(String.format("updateCount = %04d", updateCount));
			}
			
			int count = mapper.selectCountAll();
			if (count==800)
				break;

//			System.out.println(a);
		}
		
		Alpha[] alphas = mapper.selectAll("line, col desc");
		
		for (var a : alphas)
			System.out.println(a);
		
		
		conn.commit();
		conn.close();
		
		System.out.println("End...");

	}

}
