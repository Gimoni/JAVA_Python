package com.example;

public class ThrowExample {

	public static void main(String[] args) throws Exception {
		
		try {
			xxx();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		yyy();
	}
	
	static void xxx() throws Exception {
		throw new Exception();
	}
	
	static void yyy() throws Exception {
		throw new Exception();
	}
	
}
