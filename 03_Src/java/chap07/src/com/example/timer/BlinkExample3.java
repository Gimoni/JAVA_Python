package com.example.timer;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import util.Color;
import util.VT100;

public class BlinkExample3 {
	
	static class Alpha extends TimerTask {
		static Random r = new Random();
		
		int line;
		int column;
		Color fg;
		Color bg;
		char ch;
		
		public Alpha() {
			line = r.nextInt(2, 20);
			column = r.nextInt(2, 40);
			do {
				fg = Color.values()[r.nextInt(8)];
				bg = Color.values()[r.nextInt(8)];
			} while (fg==bg);
			ch = (char)r.nextInt('A', 'Z'+1);
		}
		
		void show() {
			VT100.cursorMove(line, column);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
		}
		
		void hide() {
			VT100.cursorMove(line, column);
			VT100.reset();
			VT100.print(' ');
		}
		
		boolean blink = true;

		@Override
		public void run() {
			if (blink)
				show();
			else
				hide();

			blink = !blink;
		}
		
	}
	
	static enum Direction {
		Up, Down, Left, Right
	}
	
	static class RunAlpha extends TimerTask {
		static Random r = new Random();
		
		int line;
		int column;
		Color fg;
		Color bg;
		char ch;
		
		Direction direction;
		
		public RunAlpha(char ch) {
			line = 1;
			column = 1;
			this.ch = ch;
			
			do {
				fg = Color.values()[r.nextInt(8)];
				bg = Color.values()[r.nextInt(8)];
			} while (fg == bg);
			
			direction = Direction.Right;
			
			show();
		}
		
		void show() {
			VT100.cursorMove(line, column);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
		}
		
		void hide() {
			VT100.cursorMove(line, column);
			VT100.reset();
			VT100.print(' ');
		}
		
		@Override
		public void run() {
			hide();
			
			if (line==1 && column==40)
				direction = Direction.Down;
			else if (line==20 && column==40)
				direction = Direction.Left;
			else if (line==20 && column==1)
				direction = Direction.Up;
			else if (line==1 && column==1)
				direction = Direction.Right;
			
			switch (direction) {
			case Right:
				column++;
				break;
			case Down:
				line++;
				break;
			case Left:
				column--;
				break;
			case Up:
				line--;
				break;				

			default:
				break;
			}
			show();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		VT100.reset();
		VT100.clearScreen();
		
		Timer timer = new Timer();

		for (int i=0; i<10; i++) {
			Alpha a = new Alpha();
			timer.schedule(a, 0, Alpha.r.nextInt(10, 1000));
		}
		
		for (int i=0; i<26; i++) {
			RunAlpha ra = new RunAlpha((char)('A'+i));
			timer.schedule(ra, 0, RunAlpha.r.nextInt(10, 500));
		}
		
		Thread.sleep(100000);
		timer.cancel();

		VT100.cursorMove(21, 1);
		VT100.reset();
		VT100.println("End...");
		
		
	}

}
