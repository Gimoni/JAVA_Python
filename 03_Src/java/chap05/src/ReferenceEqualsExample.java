import java.util.Scanner;

public class ReferenceEqualsExample {

	public static void main(String[] args) {
		
		/*
		 * Primitive Type.
		 */
		int num =  100;
		int num1 =  100;
		int num2 =  100;
		
		System.out.println(num == num1);	// ture 	값비교 같은 값 100;
		System.out.println(num1 == num2);	// ture		값비교 같은 값 100;
		
		
		
		/*
		 *  Reference type
		 */
		
		String str = "Hello";					// 문자열을 변수선언을 통해 저장함. 
		String str1 = new String("Hello");		//	
		String str2= new String("Hello");
		
		// 참조비교 	참조타입 비교 
		System.out.println(str == str1); 		// false 참조타입 참조 객체의 번지 비교.
		System.out.println(str1 == str2); 		// false reference type 비교. 같은 참조 객체 번지가 아님. 
		
		// 값 비교 	참조타입의 값을 비교하기 위해서 .equals 사용. 
		System.out.println(str.equals(str1));	// true
		System.out.println(str1.equals(str2));	// true
		
	}
	
	public static void main2(String[] args) {
		
		/*
		 * Primitive Type.
		 */
		
		int num = 100; 
		int num2 = num;		// 값을 복사한 것. num과 num2는 관계가 없다. num2에 num과 같은 값인 100이 복사 저장된 것. 
		
		System.out.println(num2);
		System.out.println(num);
		
		System.out.println(num == num2);	// 값 비교. 값 100을 비교함. 
		System.out.println(num != num2);
		
		/*
		 * 	Reference Type. 
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);		// 값이 heap에 만들어지고 scan 이라는 변수는 스택에 참조됨
		Scanner scan2 = scan; 						// 값이 복사되는 것이 아닌 참조가 복사되는 것. 
		Scanner scan3 = new Scanner(System.in); 		
		
		// 참조타입에 관해서 참조위치에 따른 판별이 됨.  
		System.out.println(scan == scan2);		
		System.out.println(scan != scan2);			
		System.out.println(scan == scan3);			// false 참조 주소가 다르기 때문에 false.
		
		
	}

}
