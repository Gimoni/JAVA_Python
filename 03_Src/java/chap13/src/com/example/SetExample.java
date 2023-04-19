package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
	/*
	 * set은 기존에 같은 데이터를 중복할 수 없기에 1개의 원소만 출력이 됨.
	 * list는 중복으로 저장이 가능하기 때문에 인덱스에 원소 중복저장이 됨. 
	 * 
	 */
	public static void main(String[] args) {
		
		// set
		HashSet<Integer> set1 = new HashSet<>();
		var set2 = new HashSet<Integer>();
		Set<Integer> set3 = new HashSet<>();
		
		// list
		var list = new ArrayList<Integer>();
		
		set1.add(1);
		set1.add(1);
		set1.add(1);
		
		list.add(1);
		list.add(1);
		list.add(1);
		
		System.out.println(set1);	// set은 toString이 정의되어있어서 원소를 바로 출력해줌. 
		System.out.println(list);
		
	}
}
