package util;

import java.math.MathContext;

public interface VT100 {
	
	
    public static void font(char ch) {
        char[][] equal = {
                {'=','=','=','=','=',},
                {'=',' ',' ',' ','=',},
                {'=','=','=','=','=',},
                {'=',' ',' ',' ','=',},
                {'=',' ',' ',' ','='},
        };
        for (int i=0; i<equal.length; i++) {
            for (int j=0; j<equal[i].length; j++) {
                System.out.printf("%c", equal[i][j]);
            }
            System.out.println();
        }
    }

	
	static void clearScreen() {
		System.out.printf("\033[2J");
		System.out.flush();
	}
	
	static void cursorMove(int line, int column) {
		System.out.printf("\033[%d;%dH", line, column);
	}
	
	static void setForeground(int fg) {
		System.out.printf("\033[%dm", fg);
	}
	
	static void setForeground(Color fg) {
		System.out.printf("\033[%dm", fg.ordinal() + 30);
	}
	
	static void setBackground(int bg) {
		System.out.printf("\033[%dm", bg);
	}
	
	static void setBackground(Color bg) {
		System.out.printf("\033[%dm", bg.ordinal() + 40);
	}
	
	static void reset() {
		System.out.printf("\033[0m");
		System.out.flush();
	}
	
	static void print(char ch) {
		System.out.print(ch);
		System.out.flush();
		
	}
	static void print(String str) {
		System.out.print(str);
		System.out.flush();
	}
	
	static void println(char ch) {
		print(ch+"\n");
	}
	static void println(String str) {
		print(str+"\n");
	}

}
