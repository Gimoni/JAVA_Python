package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

import util.Alpha;

public class SortExample {

	public static void main(String[] args) {
		Alpha[] alphas = new Alpha[10];
		
		for (int i=0; i<alphas.length; i++)
			alphas[i] = new Alpha();
		
		for (var a : alphas)
			System.out.println(a);
		
		System.out.println("정렬 후 ");
//		Arrays.sort(alphas, (a, b) -> a.getLine()-b.getLine()); // line asc sort
//		Arrays.sort(alphas, (a, b) -> b.getLine()-a.getLine());	// line desc sort
//		Arrays.sort(alphas, (a, b) -> a.getFg().compareTo(b.getFg()));	// fg asc sort 
		Arrays.sort(alphas, (a, b) -> {
			int rtn = 0;
			
			rtn = a.getLine() - b.getLine();	// asc
			
			if (rtn==0)
				rtn = (a.getColumn() - b.getColumn());	//desc	
			
			return rtn;
		}); 
		for (var a : alphas)
			System.out.println(a);
	}
	
	static int compare(Alpha a, Alpha b) {
		int rtn = 0;
		return rtn;
	}

}
