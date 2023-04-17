package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

import util.Alpha;

public class SortExample2 {

	public static void main(String[] args) {
		Alpha[] alphas = new Alpha[10];
		
		for (int i=0; i<alphas.length; i++)
			alphas[i] = new Alpha();
		
		for (var a : alphas)
			System.out.println(a);
		
		System.out.println("정렬 후 ");

		Arrays.sort(alphas, SortExample::compare);	// 메소드 참조 문법
		
		for (var a : alphas)
			System.out.println(a);
	}
	
	static int compare(Alpha a, Alpha b) {
		int rtn = 0;
		
		rtn = a.getLine() - b.getLine();	// asc
		
		if (rtn==0)
			rtn = (a.getColumn() - b.getColumn());	//desc	
		
		return rtn;
	}

}
