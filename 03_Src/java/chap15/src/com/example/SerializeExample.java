package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import util.Alpha;

public class SerializeExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.bin"));
		
		for(int i=0; i<5000; i++) {
			Alpha a = new Alpha();
			out.writeObject(a);
			System.out.println(a);
		}
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.bin"));
		
		for (int i=0; i<5000; i++) {
			Alpha b = (Alpha) in.readObject();
			System.out.println(b);
		}
		in.close();	
		
	}
	
	
	
	public static void main2(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Alpha a = new Alpha();
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.bin"));
		
		out.writeObject(a);
		out.close();
		System.out.println(a);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.bin"));
		
		Alpha b = (Alpha) in.readObject();
		System.out.println(b);
		in.close();
		
		
		
	}
}
