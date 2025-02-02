package com.example;

import java.util.HashSet;
import java.util.TreeSet;

import util.Alpha;

public class TreeSetExample {
	
	static class SetAlpha extends Alpha implements Comparable<SetAlpha> {

		// 정렬기준 기본설정. 
		@Override
		public int compareTo(SetAlpha o) {
			return this.line-o.line;
		}

	}

	public static void main3(String[] args) {
		String str1 = "java";
		String str2 = "python";
		System.out.println(str1.equals(str2)); 	// 동등비교 ==
		System.out.println(str1.compareTo(str2));	// 대소비교 str1 - str2 //결과 양수와 음수에 따라 양수 str1이 큼, 음수 출력 str1이 작음
		
		SetAlpha a1 = new SetAlpha();
		SetAlpha a2 = new SetAlpha();
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.compareTo(a2));
		
	}
	
	
	
	public static void main(String[] args) {
		var set1 = new HashSet<String>();
		var set2 = new TreeSet<String>((s1, s2)->s2.compareTo(s1));	//desc compare to 비교기 정렬기준 변경. 
		//String의 compare to를 사용해서 비교함
		//기본 비교기 설정은 문자열의 비교 기준에 따라서 값을 리턴 함 작은것부터~
		
		set1.add("java");
		set1.add("python");
		set1.add("html");
		set1.add("css");
		set1.add("javascript");
		
		set2.add("java");
		set2.add("python");
		set2.add("html");
		set2.add("css");
		set2.add("javascript");
		
		System.out.println(set1);
		System.out.println(set2);
	}
	
	
	public static void main2(String[] args) {
		var set1 = new HashSet<Integer>();
		var set2 = new TreeSet<Integer>();
		
		for (int i=0; i<10; i++) {
			set1.add(i);
			set2.add(i);
		}
		
		System.out.println(set1);
		System.out.println(set2);
		
		
		
		
		
	}

}
