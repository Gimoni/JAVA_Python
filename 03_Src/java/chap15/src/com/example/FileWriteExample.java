package com.example;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileWriteExample {
	
	public static void main(String[] args) throws IOException {
		FileWriter w = new FileWriter("yyy.txt");
		
		w.write('A');
		w.write("Hello");
		w.write("대한민국");
		w.write("\n");
		
		new Random().ints(10, 0, 100)
					.forEach(n -> {
						try {
							w.write(String.format("n=%d\n", n));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					});
		w.close();
		System.out.println("End..");
		
	}
	
	// project에 f5 새로고침시 만들어진 파일 확인 가능. "xxx.txt"
	public static void main2(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("xxx.txt");
		
		out.write(65);	// A
		out.write("Hello".getBytes());
		out.write("대한민국만세".getBytes());
		out.write("대한민국만세".getBytes("euc-kr"));// 한글이 깨짐. / 이클립스는 utf-8로 해석하기 때문. 
		
		out.close();
		
		System.out.println("End..");
	}

}
