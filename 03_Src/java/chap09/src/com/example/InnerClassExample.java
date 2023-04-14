package com.example;

public class InnerClassExample {
	
	int num;
	
	class A {
		int num;
		void xxx(int num) {
			num = 10;
			this.num = 20;	
			InnerClassExample.this.num = 30;
			
		}
	}
	
	public static void main(String[] args) {
		

	}

}
