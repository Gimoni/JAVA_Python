package com.example;

public class InterfaceMemberExample {
	
	int num;
	public int num2;
	
	// interface는 대부분 형용사 형태이다. 
	interface Movable {
		int num = 10;	// == public static final int num = 10;
		public static final int num2 = 10;
		static int num3 = 30;
		// 위의 int 초기화 문들은 모두 static final . 
		void move();
	}
	public static void main(String[] args) {
		
		
		
		
	}

}
