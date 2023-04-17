package com.example;

public class TriangleExample {
	/* 모든 인터페이스는 익명 구현 객체로 표현 가능하다.
	 * 함수형 인터페이스 만 람다식으로 표현 가능하다. 
	 * 
	 */
	
	@FunctionalInterface
	interface Checkable {	// 함수형 인터페이스 
		boolean check(int i, int j);
//		void show();
	}
	
	
	static void drawShape(Checkable c) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (c.check(i, j))
					System.out.print('*');
				else 
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		drawShape((i, j) -> true);
		
		System.out.println("1. ");
		drawShape((i, j) -> i>=j);

		System.out.println("2. ");
		drawShape((i, j) -> i<=j);
		
		System.out.println("3. ");
		drawShape((i, j) -> i<4-(j-1));
		drawShape((i, j) -> i+j<=4);
		
		System.out.println("4. ");
		drawShape((i, j) -> i>=5-(j+1));
		drawShape((i, j) -> i+j>=4);
		
		System.out.println("5. ");
		drawShape((i, j) -> i==0 || i==4 || j==0 || j==4);
		
		System.out.println("6. ");
		drawShape((i, j) -> i==j || 1-i==j-3);
		drawShape((i, j) -> i==j || i+j==4);
	}
	
	
}
