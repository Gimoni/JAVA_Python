package com.example;

import util.Color;

public class InheritanceExample {
	
	static class Shape {
		int line;
		int column;
		Color fg;
		Color bg;
		
		public Shape(int line, int column) {
			System.out.println("Shape()...");
		}
		
		void show() {
			
		}
		
		void hide() {
			
		}
		
	}
	
	static class Triangle extends Shape {
		public Triangle() {
			super(10, 20);

			System.out.println("Triangle()...");
		}
	}
	
	static class Circle extends Shape {
		public Circle() {
//			System.out.println("...");
			super(20, 30);
		}
	}
	
	static class Rectangle extends Shape {
		public Rectangle() {
			super(10, 40);
		}
	}

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();

		t1.line = 10;
		t1.column = 20;
		t1.fg = Color.Black;
		t1.bg = Color.Red;
		t1.show();
		t1.hide();
	}

}
