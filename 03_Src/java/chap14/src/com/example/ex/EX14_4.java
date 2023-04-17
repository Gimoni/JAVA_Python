package com.example.ex;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import util.Alpha;

public class EX14_4 {
	interface Max {
		int max(int a, int b);
	}
	interface F {
		int f(int a, int b);
	}
	
	
	public static void main(String[] args) {

//		String[] aBCD = {"aaa", "bb", "c", "dddd" };
//		Stream<String> aBCDStream = Stream.of(aBCD);
//		
//		int sum = aBCDStream.mapToInt(s -> s.length()).sum();
//		
//		System.out.println("sum = " + sum);
		
		Stream<Integer> diec = IntStream.rangeClosed(1, 6).boxed();
		
		diec.flatMap(i -> Stream.of(1,2,3,4,5,6).map(i2 -> new int[] {i, 12}))
						  .filter(iArray -> iArray[0]+iArray[1]==6)
						  .forEach(iArr -> System.out.println(Arrays.toString(iArr)));
	}

}
