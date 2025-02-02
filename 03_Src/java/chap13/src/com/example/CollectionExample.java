package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*  
 * ArrayList Create(add)
 */
public class CollectionExample {

	public static void main(String[] args) {
		var li1 = new ArrayList<Integer>();		// var 문법 사용 but 타입추론을 위해 정확한 타입을 명시해야함. 
		var li2 = new LinkedList<Integer>();
		
		// List 구현클래스 ArrayList와 LinkedList의 CRVD 연산 속도 확인하기 
		long start = 0;
		long end = 0;
		/*  
		 * ArrayList Create(add)
		 */
		start = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			li1.add(0, i); 	/* 0인덱스에 계속해서 i를 채워나감.*/
		}
		end = System.currentTimeMillis();
		System.out.println("li1 수행시간(create) : " + (end-start));
		/*
		 * linkedlist create(add)
		 */
		start = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			li2.add(0, i);	
		}
		end = System.currentTimeMillis();
		System.out.println("li2 수행시간(create) : " + (end-start));
		
		
		// 저장시에는 ArrayList 보다 Linkedlist가 빠르지만 검색 또는 읽음에 있어서 Linkedlist는 느린 편.
		
		li1.get(0);
		li2.get(0);
		/*
		 * ArrayList Retrieve(get)
		 */
		start = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			li1.get(i); 	/* 0인덱스에 계속해서 i를 채워나감.*/
		}
		end = System.currentTimeMillis();
		System.out.println("li1 수행시간(Retrive) : " + (end-start));
		
		/*  
		 * LinkedList Retrieve(get)
		 */
		start = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			li2.get(i);	
		}
		end = System.currentTimeMillis();
		System.out.println("li2 수행시간(Retrive) : " + (end-start));
		
	}
	
	
	
	

	public static void main3(String[] args) {
		var li1 = new ArrayList<Integer>();		// var 문법 사용 but 타입추론을 위해 정확한 타입을 명시해야함. 
		var li2 = new LinkedList<Integer>();
		
		// List 구현클래스 ArrayList와 LinkedList의 CRVD 연산 속도 확인하기 
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			li1.add(0, i); 	/* 0인덱스에 계속해서 i를 채워나감.*/
		}
		end = System.currentTimeMillis();
		System.out.println("li1 수행시간 : " + (end-start));
		
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			li2.add(0, i);	
		}
		end = System.currentTimeMillis();
		System.out.println("li2 수행시간 : " + (end-start));
		
		
		// 저장시에는 ArrayList 보다 Linkedlist가 빠르지만 검색 또는 읽음에 있어서 Linkedlist는 느린 편.
		
		li1.get(0);
		li2.get(0);
		
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			li1.get(50000); 	/* 0인덱스에 계속해서 i를 채워나감.*/
		}
		end = System.currentTimeMillis();
		System.out.println("li1 get 수행시간 : " + (end-start));
		
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			li2.get(5000);	
		}
		end = System.currentTimeMillis();
		System.out.println("li2 get 수행시간 : " + (end-start));
		
	}
	
	public static void main2(String[] args) {
		List<Integer> li1 = new ArrayList();
		List<Integer> li2 = new LinkedList();
		
		
	}

}
