package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class StackExample2 {

	// 연습 
	public static void main3(String[] args) {
		Random r = new Random();
//		r.ints().forEach(System.out::println);
//		r.ints(10).forEach(System.out::println);
//		r.ints(0, 100).forEach(System.out::println);
//		r.ints(10, 0, 100).forEach(System.out::println);
		
		var list = r.ints(10, 0, 100)
					.boxed()
					.toList();
		
		System.out.println(list);
		
		
	}
	
	
	public static void main(String[] args) {
		// LIFO (Last in First Out) : 마지막에 들어간 것이 처음으로 나온다.
		//ArrayList<Integer> source = new ArrayList();
		Random r = new Random();
		
		var source = new ArrayList<Integer>();
				
		r.ints(10, 0, 100)
		 .boxed()
		 .forEach(n ->  source.add(n));;
		
		var target = new ArrayList<Integer>();
		//stack create
		var stack = new Stack<Integer>();
		
	
		//정렬
		source.sort((a,b)-> a-b);	// asc 
		
		// stack에 정렬구조를 push
		source.forEach(h -> stack.push(h));
		
		System.out.println(source);
		
		// stack에서 pop
		while (!stack.empty())
			target.add(stack.pop());
		
		System.out.println(target);
		
		
	}
	
	
	public static void main2(String[] args) {
		
		// LIFO (Last in First Out) : 마지막에 들어간 것이 처음으로 나온다.
		Stack<Integer> s = new Stack(); 
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		while(!s.empty())
			System.out.println(s.pop());
			
	}

}
