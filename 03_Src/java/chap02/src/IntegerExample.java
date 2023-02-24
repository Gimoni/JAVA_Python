
public class IntegerExample {
	/*
	 * 정수 타입
	 *  1. byte		1byte
	 *  2. short	2byte
	 *  3. char		2byte
	 *  4. int 		4byte
	 *  5. long		8byte
	 *  
	 *  
	 *  Q.
	 *  1. 38(10) => 2진수로 변환
	 *  
	 *  0010 0110
	 *  
	 *  
	 *  1. -38(10) => 2진수로 변환
	 *  
	 *  0010 0110
	 *  1101 1001
	 *  
	 */
	
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		char c1 = 'A';
		char ch2 = 64;
		int num1 = 10;			// 10진수
		int num2 = 0xA;			// 16진수  _가장 많이 씀. 
		int num3 = 0b1010;		// 2진수
		int num4 = 012; 		// 8진수
		long l = Long.MAX_VALUE;
//		long l2 = 9223372036854775807;  // error; 
		long l2 = 9223372036854775807L; // integer을 벗어나는 수를 작성할 때 
										//	대문자 L을 붙여준다. 
		
		
		
		System.out.println("num1 = " + num1); // 문자열 연결연산자
		System.out.println("num2 = " + num2); // 문자열 연결연산자
		System.out.println("num3 = " + num3); // 문자열 연결연산자
		System.out.println("num4 = " + num4); // 문자열 연결연산자
		
	}
	public static void main2(String[] args) {
		// 정수 타입
		byte b;
		short s;
		char c;
		int i;
		long l;
		
//		b=0b0010_0110; // 38(10)
//		byte b2= (byte)0b1101_1010; //-38(10)
//		System.out.println(b);
//		System.out.println(b2);
		
		b=(byte)0b0111_0011;
		byte b2 = (byte)0b1000_1101;
		System.out.println(b);
		System.out.println(b2);
	}

}
