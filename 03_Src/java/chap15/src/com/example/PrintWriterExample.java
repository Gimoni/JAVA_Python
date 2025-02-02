package com.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class PrintWriterExample {
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		PrintWriter w = new PrintWriter("xxx.log");
		
		w.write('A');
		w.write('가');
		w.println();
		
		for (int i=0; i<10; i++ ) {
			var now = LocalTime.now();
			w.printf("%02d:%02d:%02d\n", now.getHour(), now.getMinute(), now.getSecond());
			
			Thread.sleep(1000);
			
			System.out.println(".");
		}
			
		
		w.close();

		System.out.println("End..");
	}
}
