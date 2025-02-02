package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Consumer;

import util.Alpha;

public class AlphaSortExample {

	public static void main(String[] args) {
		var al = new ArrayList<Alpha>();
		var ll = new LinkedList<Alpha>();
		
		for(int i=0; i<50000; i++) {
			var alpha = new Alpha();
			al.add(alpha);
			ll.add(alpha);
		}
		
//----------------------------------------------------------------		
		
//		for (var a : ll) 
//			System.out.println(a);
		
//----------------------------------------------------------------		
		Consumer<Alpha> p = new Consumer<Alpha>() {

			@Override
			public void accept(Alpha t) {
				System.out.println(t);
			}
			
		};

		al.forEach(p);
		
//-----------------------------------------------------------------
		//lambda 
		// 타겟타입에 추상메소드를 보고 람다식을 구현..
		ll.forEach(a -> System.out.println(a));
//-----------------------------------------------------------------
		// method reference 메소드 참조 
		al.forEach(System.out::println);
		
	}
}
