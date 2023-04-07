package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import util.Color;
import util.VT100;

public class SortExample2 {

	static Random r = new Random();
	
	static class Alpha {
		int line;
		int column;
		Color fg;
		Color bg;
		char ch;
		
		public Alpha() {
			line = r.nextInt(1, 21);
			column = r.nextInt(1, 41);
			do {
				fg = Color.values()[r.nextInt(8)];
				bg = Color.values()[r.nextInt(8)];
			} while (fg==bg);
			ch = (char)r.nextInt('A', 'Z'+1);
		}
		
		//Override 
		public String toString() {
			return String.format("(%2d,%2d,%7s,%7s,'%c')", line, column, fg, bg, ch);
		}
	}
	
	static class Order implements Comparator<Alpha>{

		@Override
		public int compare(Alpha o1, Alpha o2) {
			int rtn = 0;
			if (o1.column > o2.column)
				rtn = 1;
			else if (o1.column < o2.column)
				rtn = -1;		
			else 
				rtn = 0;
			
			if (o1.ch > o2.ch)
				rtn = 1;
			else if (o1.ch < o2.ch)
				rtn = -1;		
			else 
				rtn = 0;

			if (rtn == 0) {
				rtn = o1.line - o2.line;
			}// line asc
			
			return rtn;
			
		}

		
	}
	
	static class Order2 implements Comparator<Alpha>{

		@Override
		public int compare(Alpha o1, Alpha o2) {
			return o1.fg.ordinal() - o2.fg.ordinal();
		}
		
	}
	
	public static void main(String[] args) {
		
		Alpha[] alphas = new Alpha[800];
		for (int i=0; i<alphas.length; i++) {
			alphas[i] = new Alpha();
		}
		
		System.out.println(alphas);
		
		Arrays.sort(alphas, new Order());
		
		for (var a: alphas) {
//			VT100.reset();
//			VT100.clearScreen();
			
			System.out.println(a);
		}
		
	}
	

}
