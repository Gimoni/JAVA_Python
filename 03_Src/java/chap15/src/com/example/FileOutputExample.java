package com.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("onmega.bin");
		
		byte[] buffer = new byte[1024];
		for (int i=0; i<1024; i++) {
			for(int j=0; j<1024; j++)
				buffer[i] = (byte)j;
			
			file.write(buffer);
		}
		
		file.close();
		System.out.println("End..");
	}
}
