package com.example;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
/*
 * stream 과 reader의 차이점.
 */
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("text.txt");
		
		int c = reader.read();
		while(true) {
			char[] buffer = new char[100];
			int len = reader.read(buffer);
			if (len<0)
				break;
			
			System.out.print(new String(buffer, 0, len));
		}
	}
	
	public static void main4(String[] args) throws IOException {
		// text file의 영어를 제외한 다른 언어들도 출력가능.. 
		FileReader reader = new FileReader("text.txt");
		
		int c = reader.read();
		while(true) {
			int b = reader.read();
			if (b<0)
				break;
			
			System.out.print((char)b);
		}
	}
	
	public static void main3(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("text.txt");
		
		// 반복문을 사용해서 전체 text file을 출력. (but 영어를 제외한 다른 언어들은 1byte로 처리가 안되기 때문에 출력에 오류가 남. )
		while(true) {
			int b = in.read();
			if (b<0)
				break;
			
			System.out.print((char)b);
		}
		
		
		
		in.close();
		System.out.println("End..");
		
	}
	
	
	public static void main2(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("text.txt");
		
		int b = in.read();
		System.out.println((char)b);
		
		b = in.read();
		System.out.println((char)b);
		
		System.out.println("End..");

	}

}
