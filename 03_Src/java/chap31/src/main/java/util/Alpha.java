package util;

import java.util.Random;

import lombok.Data;
import util.Color;

@Data
public class Alpha {
	static Random r = new Random();
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
	public Alpha( int line, int column, Color fg, Color bg, char ch) {
		this.line = line;
		this.column = column;
		this.fg = fg;
		this.bg = bg;
		this.ch = ch;
	}
	
	public String toString() {
		return String.format("[%02d, %02d, %7s, %-7s, '%c']",  line, column, fg, bg, ch);
	}

	
}
