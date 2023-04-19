package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Consumer;

import util.Alpha;

public class AlphaSortExample3 {

	public static void main(String[] args) {
		var al = new ArrayList<Alpha>();
		var ll = new LinkedList<Alpha>();
		
		for(int i=0; i<50000; i++) {
			var alpha = new Alpha();
			al.add(alpha);
			ll.add(alpha);
		}
		
		// check the size : 50000
		System.out.println(al.size());
		System.out.println(ll.size());
		
		//lambda ; 매개변수 2개를 리턴 받는 타켓타입을 만들어야함. 
		//		 sort a,b를 비교 리턴값을 기준으로 모든 요소에 대해 처리함 
//		al.sort((a, b)-> 0);
		
//		al.sort((a, b)-> a.getLine() - b.getLine());
		
		al.sort((a, b)-> {
			int rtn= a.getLine() - b.getLine();
			
			if (rtn==0)
				rtn = a.getColumn() - b.getColumn();
			return rtn;
		});
		// 함수적 프로그래밍 // stream 
		al.stream().limit(1000).forEach(System.out::println);
		
	}
}
