package util;

public class VT100 {
	
	public static void clearScreen() {
		System.out.print("\033[2J");
		System.out.flush();
	}
	
	public static void cursorMove(int line, int column) {
		System.out.printf("\033[%d;%dH", line, column);
	}
	
	public static void setForeground(int fg) {
		System.out.printf("\033[%dm", fg);
	}
	
	public static void setBackground(int bg) {
		System.out.printf("\033[%dm", bg);
	}
	
	public static void reset() {
		System.out.printf("\033[0m");
		System.out.flush();
	}
	
}
