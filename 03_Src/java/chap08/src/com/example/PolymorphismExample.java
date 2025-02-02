package com.example;

public class PolymorphismExample {

	static class Alpha implements Runnable {

		@Override
		public void run() {
			for(int i=0; i<100; i++) {
				System.out.print('A');
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	static class Num implements Runnable{

		@Override
		public void run() {
			for(int i=0; i<100; i++) {
				System.out.print('1');
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Alpha());
		Thread t2 = new Thread(new Num());
		
		t1.start();
		t2.start();
		
		System.out.println("End..");
	}

}
