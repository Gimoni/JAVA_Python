package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SelfStudyFileStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream mp4 = new FileInputStream("Wildlife.mp4");
		
		int v = mp4.read();
		while(true) {
			byte[] play = new byte[100000];
			int all = mp4.read(play);
			if (all<0)
				break;
			
//			System.out.print(new String(play, 0, all));
			System.out.println("End");
		}
		
		FileOutputStream mp4Play = new FileOutputStream("yyy.mp4");
		
		
		
	}
}
