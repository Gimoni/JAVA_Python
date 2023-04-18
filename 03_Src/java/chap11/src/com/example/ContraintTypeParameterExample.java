package com.example;

public class ContraintTypeParameterExample {

	static class A {
		
	}
	
	static class B extends A {
		
	}
	
	static class C {
		
	}
	
	 // 제한된 타입 파라미터 /
	static class Box<T extends A> {// A와 A를 상속받은 B만 올수 있음 .
		T contenet;
	}
	
	public static void main(String[] args) {
//		Box<String> b1 = new Box<>(); // X error
		Box<A> b2 = new Box<>();
		Box<B> b3 = new Box<>();
//		Box<C> b4 = new Box<>();	// X error : 상속받지 않았기 때문, 제한에 속하지 않음. 
		
	}

}
