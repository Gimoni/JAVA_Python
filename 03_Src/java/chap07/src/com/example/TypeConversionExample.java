package com.example;

public class TypeConversionExample {
	static class Parent {
		
	}
	
	static class Child extends Parent {
		
	}
	static class Child2 extends Parent {
		
	}

	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child();
		Child2 c3 = new Child2();
		
		String str = new String("Hello");
		
		Parent p1;
		
		p1 = c1;
		p1 = c2;
		p1 = c3;
		
		c3 = (Child2)p1;

		
		
		

	}

}
