package util;

import java.util.Objects;
import java.util.Random;

public class Alpha {
	static Random r = new Random();
	int line;
	int column;
	Color fg;
	Color bg;
	char ch;
	
	public Alpha() {
		line = r.nextInt(1, 21*1000000);
		column = r.nextInt(1, 41*1000000);
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
	
	@Override
	public String toString() {
		return String.format("[%02d, %02d, %7s, %-7s, '%c']",  line, column, fg, bg, ch);
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode...");
		return Objects.hash(line, column);
	}
	
	@Override
	public boolean equals (Object obj) {
		System.out.println("equals..");
		Alpha target = (Alpha)obj;
		return this.line == target.line&&this.column==target.column;
	}

	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public Color getFg() {
		return fg;
	}
	public void setFg(Color fg) {
		this.fg = fg;
	}
	public Color getBg() {
		return bg;
	}
	public void setBg(Color bg) {
		this.bg = bg;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	
}
