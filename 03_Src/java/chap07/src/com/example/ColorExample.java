package com.example;

import java.util.Random;

import util.Color;

public class ColorExample {
	
	public static void main(String[] args) {
		var r = new Random();
		Color[] cs = Color.values();
		
		for (var c : cs) {
			System.out.printf("%s [%d]\n", c, c.ordinal());
		}
		
		Color c = Color.values()[r.nextInt(8)];
		System.out.println(c);
	}

	public static void main2(String[] args) {
		Color c = Color.Black;
//		Color c1 = 30;
		Color c2 = null;
		Color c3 = Color.Yellow;
		
		System.out.printf("%s %d\n", c, c.ordinal());
		System.out.printf("%s %d\n", c3, c3.ordinal());

	}

}
