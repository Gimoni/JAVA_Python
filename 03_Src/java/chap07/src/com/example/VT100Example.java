package com.example;

import util.Color;
import util.VT100;

public class VT100Example {
	
	static class A extends Thread {
		
	}
	
	static class B /*extends Math*/ {
		
	}
	
	static class C /*extends VT100*/ {
		
	}

	public static void main(String[] args) {
		VT100.clearScreen();
		
		VT100.cursorMove(10, 10);
		VT100.setForeground(Color.Red);
		VT100.setBackground(Color.Blue);
		VT100.println("Hello");

		VT100.reset();
	}

}
