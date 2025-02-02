package com.example;

public class AnonymousExample {
	int num;
	static class A {
		
		void show() {
			System.out.println("A...");
		}
	}
	
	static class B extends A {
		
	}
	
	public static void main(String[] args) {
//		num = 100;	// (X) 접근불가 
		A a = new A();	// static class에서 new 생성, 접근 가능.
		B b = new B();
		
		// 익명 객체 
		A a1 = new A() {
			
			@Override
			void show() {
				System.out.println("Anonymous....");
			}
		};
		
		a1.show();
		
	}

}
