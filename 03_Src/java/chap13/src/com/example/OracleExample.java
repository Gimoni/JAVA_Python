package com.example;

import java.sql.Connection;

import util.Oracle;

public class OracleExample {

	public static void main(String[] args) {
		Connection conn = Oracle.getInstance();
		
		System.out.println("End...");
	}

}
