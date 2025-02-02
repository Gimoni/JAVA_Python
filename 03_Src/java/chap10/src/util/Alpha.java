package util;

import java.util.Random;

public class Alpha {
	static Random r = new Random();
	int no;
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
	public Alpha(int no, int line, int column, Color fg, Color bg, char ch) {
		this.no = no;
		this.line = line;
		this.column = column;
		this.fg = fg;
		this.bg = bg;
		this.ch = ch;
	}
	
	public String toString() {
		return String.format("[%d, %d, %d,%s, %s,%c]", no, line, column, fg, bg, ch);
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
