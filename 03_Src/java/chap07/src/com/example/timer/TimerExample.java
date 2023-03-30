package com.example.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
	
	static class A extends TimerTask {

		@Override
		public void run() {
			System.out.println('A');
		}
		
	}
	
	static class B extends TimerTask {

		@Override
		public void run() {
			System.out.println('B');
		}
	}

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		A a = new A();
		B b = new B();
		
		timer.schedule(a, 0, 500);
		timer.schedule(b, 0, 100);
		

		System.out.println("End...");
	}

}
