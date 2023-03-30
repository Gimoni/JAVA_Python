package com.example;

public class OverridingExample {
	static class Shape {
		
		public void show() {
			System.out.println("========");
		}
		
		void hide() {
			System.out.println("@@@@@@@@");
		}
	}
	
	static class Circle extends Shape {
		
		public void show() {
			super.show();
			System.out.println("원 그리기");
			super.show();
		}
		
		public void hide() {
			super.hide();
			System.out.println("원 지우기");
			super.hide();
		}
	}

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.show();
		c.hide();

	}

}
