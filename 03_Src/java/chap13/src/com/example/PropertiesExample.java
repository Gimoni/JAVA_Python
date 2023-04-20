package com.example;

import java.util.Properties;
/*
 * 자바에서의 환경변수 properties 
 */
public class PropertiesExample {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		
		prop.forEach((k, v) -> System.out.printf("%s=%s\n", k, v));
		
		
	}
}
