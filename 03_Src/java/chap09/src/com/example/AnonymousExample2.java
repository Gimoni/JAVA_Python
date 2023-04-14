package com.example;

public class AnonymousExample2 {

	interface Drawable {
		void draw();
	}
	
	static class A implements Drawable {

		@Override
		public void draw() {
			System.out.println("A..");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Drawable d1 = new A();
		
		// 익명 구현 객체 // 클래스 선언문을 합쳐진 것 / 한번만 수행될 때 사용. 
		Drawable d2 = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("d2...");
			}
		};
				
		d2.draw();
	}

}
