package com.example;

import java.util.Arrays;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Integer [] nums = {1, 3, 2, 9, 5};
		
//		Arrays.sort(nums, (a, b) -> a-b);	// asc
//		Arrays.sort(nums, (a, b) -> b-a);	// desc
		Arrays.sort(nums, Math::subtractExact);		// asc
		
		System.out.println("정렬후");
		System.out.println(Arrays.toString(nums));
		
		Arrays.stream(nums).forEach(n -> System.out.println(n));
		Arrays.stream(nums).forEach(System.out::println);	// println은 instance method이기에 
															// 객체출력이 가능. 생성자도 가능. 
		
	}

}
