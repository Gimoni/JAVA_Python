package com.example;
/*
 * 클래스 - 필드 / 로컬 
 * 인스턴스 멤버 클래스 / 정적 멤버 클래스 
 */
public class NestedClassExample {
	int outNum;
	static int outNum2;
	
	
	
	// 인스턴스 클래스
	class A {
		int num;
		static int num2;
		
		static {
			
		}
		
		void xxx() {
			outNum = 10;
			outNum2 = 20;
		}
		
		static void yyy() {
			
		}
	}
	
	
	static void outerMethod() {	// 정적 메소드 
//		outNum = 10;	// (X) static 에서 인스턴스 필드 접근이 불가. 
		
		outNum2 = 10;
	}
	
	
	// 정적 클래스 
	static class B {	// 정적 메소드와 같은 특성을 가지고 있다. 
		int num;
		static int num2;
		
		static {
			
		}
		
		void xxx() {
//			outNum = 10;	 // (X) outer의 요소가 static 이 아니기 때문에 접근 불가 . 
			outNum2 = 20;		// outer static 접근 가능. 
		}
		
		static void yyy() {
			
		}
		
	}
	public static void main(String[] args) {
		// 로컬 클래스
		class C {
			int num; 
			static int num2;
			
			static {
				
			}
			void xxx() {
//				outNum = 10; // (X)인스턴스는 new 생성으로 정의를 따로 해주어야 접근이 가능. 
				
				outNum2 = 20;
			}
			
			static void yyy() {
				
			}
			
		}
		
	}

}
