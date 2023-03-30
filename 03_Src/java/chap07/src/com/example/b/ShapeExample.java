package com.example.b;

import com.example.a.Shape;

public class ShapeExample {
	
	static class Circle extends Shape {
		
		void show() {
//			super.num = 100;
			super.num2 = 200;	// protected
		}
		
	}

	public static void main(String[] args) {
		Shape s = new Shape();
		
//		s.num = 100;
//		s.num2 = 200;

	}

}
