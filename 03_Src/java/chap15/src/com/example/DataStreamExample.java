package com.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("xxx.bin");
		DataOutputStream dout = new DataOutputStream(out);
		
		dout.writeDouble(10.5);
		// double = 8byte
		dout.writeInt(100000);
		// integer 4 byte * 8byte = 12byte
		
		dout.close();
		
		FileInputStream in = new FileInputStream("xxx.bin");
		DataInputStream din = new DataInputStream(in);
		
		System.out.println(din.readDouble());
		System.out.println(din.readInt());
		
		din.close();

		System.out.println("End.. ");
		
		
		
	}
}
