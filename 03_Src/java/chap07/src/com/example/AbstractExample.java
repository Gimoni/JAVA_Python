package com.example;

import util.Color;

public class AbstractExample {
	
	static abstract class Shape { // 추상클래스 
		int line;
		int column;
		Color fg;
		Color bg;
		
		public Shape() {

		}
		
		abstract void show(); // 추상메소드
		abstract void hide(); // 추상메소드
	}
	
	static class Circle extends Shape {

		@Override
		void show() {
			
		}
		
		@Override
		void hide() {
			
		}
		
	}

	public static void main(String[] args) {
		Circle c = new Circle();

	}

}
