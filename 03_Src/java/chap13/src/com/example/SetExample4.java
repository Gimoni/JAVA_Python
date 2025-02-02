package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import util.Alpha;

public class SetExample4 {
	/*
	 * set은 기존에 같은 데이터를 중복할 수 없기에 1개의 원소만 출력이 됨.
	 * list는 중복으로 저장이 가능하기 때문에 인덱스에 원소 중복저장이 됨. 
	 * 
	 */
	public static void main(String[] args) {
		
		// set
		HashSet<Alpha> set = new HashSet<>();
		
		// list
		var list = new ArrayList<Alpha>();
		
		// 생성 list, set
		for(;;) {
			Alpha a = new Alpha();
			list.add(a);
			set.add(a);
			
			if (set.size() == 800)
				break;
		}
		
		System.out.println(list.size());
		System.out.println(set.size());
		
		exit:
		for (int i=1; i<21; i++)
			for (int j=1; j<41; j++) {
				Alpha a = new Alpha();
				a.setLine(i);
				a.setColumn(j);
				
				if(!set.contains(a)) {
					System.out.println("에러입니다.");
					break exit;
				}
			}
		
		
		System.out.println("End...");
	}
}
