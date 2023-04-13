package com.example;

import java.util.Arrays;
import java.util.Comparator;

public class CompareExample {
	
	static class A implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2 - o1;
		}

		
	}

	public static void main(String[] args) {
		
		Integer [] nums = {1, 6, 3, 7, 5};
		
		Arrays.sort(nums);	// arrays asc 정렬. 
		Arrays.sort(nums, new A());
		
		Comparator<Integer> c = new A();
		Arrays.sort(nums, c);	// arrays desc 정렬.. 
		
		System.out.println(Arrays.toString(nums));
		
	}

}
