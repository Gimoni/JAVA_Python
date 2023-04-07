package com.example;

public class ExceptionExample {

	public static void main(String[] args) {

//		System.out.println(10/0);
		String str = null;
		
		
//		System.out.println(str.charAt(0));	// exception : cannot invoke "String.charAt(int)...
		
//		NullPointerException
		
		String[] x = {};
		System.out.println(x[10]);
		
//		ArrayIndexOutOfBoundsException
		
		// checked exception
//		InterruptedException
		
		// checked exception : InterruptedException  
		// try catch / 
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Program end.. ");
	}

}
