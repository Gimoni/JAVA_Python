package com.example;

import java.util.TimerTask;

// 인터페이스 상속. 
public class InheritanceExample {

	interface Moveable {
		void move();
	}
	
	interface Drawable extends Runnable, Moveable{
		void draw();
	}
	
	class A implements Drawable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	// class C는 timertask를 상속 받고 동시에 moveable 인터페이스 규칙을 지켜서 만들어지는 클래스. 
	static class C extends TimerTask implements Moveable {

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {

		C c1 = new C();
		TimerTask c2 = new C();
		Moveable c3 = new C();
	}

}
