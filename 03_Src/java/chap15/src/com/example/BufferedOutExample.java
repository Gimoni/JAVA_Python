package com.example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class BufferedOutExample {
	// buffered 기능을 사용. : 보조 스트림 사용
	public static void main(String[] args) throws IOException {
		FileOutputStream o = new FileOutputStream("xxx.bin");
		BufferedOutputStream out = new BufferedOutputStream(o);
		
		var start = LocalTime.now();
		for (int i=0; i<1024*1024*100; i++) {
//			o.write('A');
			out.write('A');
//			System.out.println(".");
		}
		var end = LocalTime.now();
		System.out.println(start.until(end, ChronoUnit.MILLIS));
		
		out.close();
//		o.close();
		System.out.println("End..");
		
	}
}