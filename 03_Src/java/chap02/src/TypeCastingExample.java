
public class TypeCastingExample {

	public static void main(String[] args) {
		
		boolean tf = true;
		int num;
		
//		num = tf;			// error
//		num = (int)tf;		// error
		
		// 형 변환 자체가 이루어지지 않는 타입
		
		String str = "Hello";
		
//		num = str; 			// error
//		num = (int)str;		// error
		
		
		
	}
	
	
	public static void main2(String[] args) {

		short s = 3000;
		byte b;
		
//		b = s; 				// error 
		
		b = (byte)s;		// 강제 형변환 
							//short s를  byte로 강제 타입변환을 시킨다. 
		
		System.out.println("b = " + b); 		// b = -72
		
		
		float f1 = 3.14f;
		
//		b = f1;  		// 실수를 정수에 담을 수 없다.. 
		b = (byte)f1;	// 강제 형변환이 가능하다 but 소수부는 삭제된다. 
		
		System.out.println("b = " + b);
		
		//
		
		float f2 = 3000.14f;
		
//		b = f2;
		b = (byte)f2;
		
		System.out.println("b = " + b);
		
		
		
	}

}
