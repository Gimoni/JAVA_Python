package com.example;

public class AnonymousExample3 {
// 익명 자식객체 
	static class A implements Runnable {

		@Override
		public void run() {
			for (int i=0; i<100; i++) {
				System.out.print("A");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(a);
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					System.out.print("1");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});	// 매개변수 안에 클래스 선언문이 들어감. 
		
		t2.start();
	}

}
