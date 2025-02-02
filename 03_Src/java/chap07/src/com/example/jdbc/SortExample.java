package com.example.jdbc;

import java.util.Arrays;
import java.util.Comparator;

import util.Color;

public class SortExample {

	static class Alpha {
		int line;
		int column;
		Color fg;
		Color bg;
		char ch;
		
		public Alpha(int line, int column, Color fg, Color bg, char ch) {
			this.line = line;
			this.column = column;
			this.fg = fg;
			this.bg = bg;
			this.ch = ch;
		}
		
		//Override 
		public String toString() {
			return String.format("(%2d,%2d,%7s,%7s,'%c')", line, column, fg, bg, ch);
		}
	}
	
	static class Order implements Comparator<Alpha>{

		// 2자 정렬. asc
		@Override
		public int compare(Alpha o1, Alpha o2) {
			int rtn = 0;
			if (o1.column > o2.column)
				rtn = 1;
			else if (o1.column < o2.column)
				rtn = -1;		
			else 
				rtn = 0;
			
			if (rtn == 0) {
				rtn = o1.line - o2.line;
			}// line asc
			
//			if (rtn == 0) {
//				rtn = -(o1.line - o2.line);
//			}// line desc
//			
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
		// 정렬
		Alpha[] a = new Alpha[5];
		a[0] = new Alpha(10, 10, Color.Black, Color.Red, 'A');
		a[1] = new Alpha(10, 20, Color.Black, Color.Red, 'B');
		a[2] = new Alpha(20, 10, Color.Black, Color.Red, 'C');
		a[3] = new Alpha(20, 20, Color.Black, Color.Red, 'D');
		a[4] = new Alpha(30, 10, Color.Black, Color.Red, 'E');
		
		Arrays.sort(a, new Order());
		
		for (var x : a) {
		System.out.println(x);
		}
	}

}
