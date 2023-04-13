package com.example;

public class RunnableExample {

	// 구현 클래스 : 인터페이스를 준수해서 생성한 클래스 .  Number클래스는 Runnable 인터페이스의 구현 클래스이다. 
	static class Number implements Runnable{

		@Override
		public void run() {
			
		}
		
	}
	
	static class Alpha implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Number n = new Number();
		Alpha a = new Alpha();
		
		Thread t1 = new Thread(n);
		Thread t2 = new Thread(a);
		
	}

}
