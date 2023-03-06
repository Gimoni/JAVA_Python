
public class TriangleExample {
		/*
		 * 	1.			2.			3.			4.		
		 * 	*		*****		*****			*
		 *  **		 ****		****		   **
		 *  ***		  ***		***			  ***
		 *  ****	   **		**		 	 ****
		 *  *****		*		*			*****
		 */
		// 삼각형 출력하기
	
	
	public static void main(String[] args) {
		// 1.
		System.out.println("1.");
		for (int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) // j가 0일때 1이 찍혀야 한다.
				System.out.print("*");
			
			for (int j=0; j<4-i; j++)
				System.out.print(" ");
			
			System.out.println();
		}System.out.println();
		
		//2.
		System.out.println("2.");
		for (int i=0; i<5; i++) {
			for (int j=0; j<i; j++)
				System.out.print(" ");
			
			for (int j=0; j<5-i; j++)
				System.out.print("*");
			
			System.out.println();
		}System.out.println();
		
		//3.
		System.out.println("3.");
		for (int i=0; i<5; i++) {
			for (int j=0; j>4-i; j++)
				System.out.print(" ");
			
			for (int j=0; j<5-i; j++) 
				System.out.print("*");
			System.out.println();
		}System.out.println();
		
		//4.
		System.out.println("4.");
		for (int i=0; i<5; i++) {
			for (int j=0; j<5-i; j++) 
				System.out.print(" ");
			
			for (int j=0; j<i+1; j++)
				System.out.print("*");
			
			System.out.println();
		}System.out.println();
		
	}
	
	public static void main8(String[] args) {
		// 1.
		for (int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) // j가 0일때 1이 찍혀야 한다.
				System.out.print("*");
			System.out.println();
		}
	}
	
	
	
		
	public static void main7(String[] args) {
		// 4. 
		for (int i=0; i<5; i++) { 
			for (int j=1; j<6 -i -1; j++)
				System.out.print(" "); {
					for (int k = 0; k<=i; k++) {
						System.out.print("*");
					}
				}
			
			System.out.println();
		}
	}
	public static void main6(String[] args) {
		// 3.
		for (int i=0; i<5; i++) {
			for (int j=0; j<5 -i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main5(String[] args) {
		// 2. 
		for (int i=0; i<5; i++) {
			for (int j=0; j<5 -i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main4(String[] args) {
		// 1.
		for (int i=0; i<5; i++) {
			for (int j=0; j<i + 1; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main3(String[] args) {
		// 기본 로직 ( 사각형 )
		for (int i=0; i<5; i++) { 
			for (int j=0; j<5; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	public static void main2(String[] args) {
		// 직각삼각형의 각 변의 길이 
		int cnt = 0;
		
		for (int a=1; a<=100; a++) 
			for(int b=1; b<=100; b++)
				for (int c=1; c<=100; c++)
					if (a*a + b*b == c*c) {
						cnt++;
						System.out.printf("[%d,%d,%d]\n", a, b, c);
					} 
		System.out.println("cnt = " + cnt);
	}
		
}
