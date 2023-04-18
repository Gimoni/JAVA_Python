package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import util.Alpha;

public class GenericExample2 {
	
	static class BoxString {
		String content;
	}
	
	static class BoxInteger {
		Integer content;
	}
	
	static class BoxDouble {
		Double content;
	}
	
	static class BoxBoolean {
		Boolean content;
	}
	
	
	
	//  제네릭.. 생성자 
	static class Box<T> {
		T content;
		
		Box () { // 기본생성자
			
		}
		
		Box (T content) {
			this.content = content;
		}
	}
	// 제네릭 메소드의 구분을 위해 <T> /./ 매개변수가 있는 제너릭 메소드 
	static <T> Box<T> boxing(T v) {
		
		return new Box<T>(v);
	}
	
	static <T> Box<T> boxing() { // 매개변수가 없는 제너릭 메소드 
		
		return new Box<T>();
	}
	
	
	
	public static void main(String[] args) {

		Box<Integer> b1 = boxing(100);	// 타입 추론 
		Box<Integer> b2 = GenericExample2.boxing(100);	// 타입 추론 
		Box<Integer> b3 = GenericExample2.<Integer>boxing(100);
		
		GenericExample2.boxing();	// 추론이 되지 않고. object type으로 명시적 구분됨. 
		GenericExample2.<String>boxing(); // 타입추론이 되지 않은 object type에 명시적 타입을 명시해준다. 
		
	}

}
