package com.example.timer;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import util.Color;
import util.VT100;

public class BlinkExample2 {
	
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

	public static void main(String[] args) throws InterruptedException {
		VT100.reset();
		VT100.clearScreen();
		
		Timer timer = new Timer();

		for (int i=0; i<10; i++) {
			Alpha a = new Alpha();
			timer.schedule(a, 0, Alpha.r.nextInt(10, 1000));
		}
		
		Thread.sleep(10000);
		timer.cancel();

		VT100.cursorMove(21, 1);
		VT100.reset();
		VT100.println("End...");
		
		
	}

}
