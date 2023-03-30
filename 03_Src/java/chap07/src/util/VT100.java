package util;

import java.math.MathContext;

public final class VT100 {
	
	private VT100() {
		
	}
	
	public static void clearScreen() {
		System.out.printf("\033[2J");
		System.out.flush();
	}
	
	public static void cursorMove(int line, int column) {
		System.out.printf("\033[%d;%dH", line, column);
	}
	
	public static void setForeground(int fg) {
		System.out.printf("\033[%dm", fg);
	}
	
	public static void setForeground(Color fg) {
		System.out.printf("\033[%dm", fg.ordinal() + 30);
	}
	
	public static void setBackground(int bg) {
		System.out.printf("\033[%dm", bg);
	}
	
	public static void setBackground(Color bg) {
		System.out.printf("\033[%dm", bg.ordinal() + 40);
	}
	
	public static void reset() {
		System.out.printf("\033[0m");
		System.out.flush();
	}
	
	public static void print(char ch) {
		System.out.print(ch);
		System.out.flush();
		
	}
	public static void print(String str) {
		System.out.print(str);
		System.out.flush();
	}
	
	public static void println(char ch) {
		print(ch+"\n");
	}
	public static void println(String str) {
		print(str+"\n");
	}

}
