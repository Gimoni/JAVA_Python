package com.example;

public class StaticMethodExample {

	interface A {
		// 상수 (public static final)
		// 추상메소드 (public abstract xxx()) 
		
//		default void xxx() {
//			System.out.println("xxx....");
//		}
		
		static void yyy() {
			System.out.println("yyy...");
		}
		
		private static void zzz() {
			System.out.println("zzz...");
		}
		
		
	}
	

	public static void main(String[] args) {
		
		A.yyy();

	}

}
