package com.example;


public class InterfaceExample {
	// 일반 클래스 new OK
	static class A {
		
	}
	
	// 추상 클래스 new X
	static abstract class B {	// 일반 클래스에서 바디가 없는 추상 메소드라고 알려 주어야 함. 
		public B() {
			
		}
		void xxx() {
			
		}
		abstract void draw();	// abstract 추상ㅇ
	}
	
	static class C extends A {
		
	}
	
	static class D extends B {	// 추상 클래스에 implements add 

		@Override
		void draw() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	enum Gender {
		MALE, FEMALE
	}
	
	interface Drawable {

		void draw();
		void move();
	}
	
	// 구현 클래스 . ( 인터페이스를 준수 생성함 : E클래스는 Drawble 인터페이스의 구현 클래스이다. )
	//								    E클래스는 Runnable 인터페이스의 구현 클래스이다.)
	class E implements Drawable, Runnable { // implements를 통해서 인터페이스 규격을 준수해서 e클래스에 인터페이스를 구현한다. 

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			
		}

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
		A a = new A();
//		B b = new B();		// new 생성 불가 
//		Gender g = new Gender();	// new 생성 불가 
//		Drawable d = new Drawable();	// 
		
		
	}

}
