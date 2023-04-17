package com.example.ex;

import java.util.function.IntBinaryOperator;

public class LamdaExample {
	private static int[] scores = { 10, 50, 3};
	
	public static int maxOrMin( IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	public static void main(String[] args) {
		int max = maxOrMin((a,b)-> (a>=b)?a:b);
		System.out.println("최대값 : " + max);
		//익명 객체 구현
		max = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int a, int b) {
				return (a>b)? a:b;
			}
		});
		
		int min = maxOrMin((a,b) -> (a<b)?a:b);
		System.out.println("최소값 : " + min);
	}
}