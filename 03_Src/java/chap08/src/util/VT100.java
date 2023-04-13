package util;

import java.math.MathContext;

public interface VT100 {
	int F_BLACK 	= 30;
	int F_RED		= 31;
	int F_GREEN		= 32;
	int F_YELLOW	= 33;
	int F_BLUE		= 34;
	int F_MAGENTA	= 35;
	int F_CYAN		= 36;
    int F_WHITE		= 37;
    
	int B_BLACK 	= 40;
	int B_RED		= 41;
	int B_GREEN		= 42;
	int B_YELLOW	= 43;
	int B_BLUE		= 44;
	int B_MAGENTA	= 45;
	int B_CYAN		= 46;
    int B_WHITE		= 47;
    
    
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
