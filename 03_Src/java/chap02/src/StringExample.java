
public class StringExample {
	/*
	 * 타입
	 * 1. Primitive Type (기본타입, 원시타입) - 8EA
	 * 		- 정수 : byte, short, char, int, long
	 * 		- 실수 : float, double 
	 * 		- 논리 : boolean
	 * 
	 * 2. Reference Type (참조타입) - N개
	 * 		- String 
	 * 		// 표기 대문자로 시작함.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int String = 100; // 변수의 키워드가 아닌 상황. 식별자로 사용 가능 
//		int float = 200; // error /  변수의 키워드는 식별자로는 사용이 불가능 
		String str1 = "Hello world";
		String str2 = "대한민국";
		
		char ch = 'A';
//		char ch2 = ''; // error 빈 문자열이 될 수 없다. 
		String str10 = ""; // null string , empty string 빈 문자열이 가능. 
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = " \"특수문자 사용 이스케이프\" ";	
		// 특수문자 사용시 역슬래시 사용 \ 
		// white space : tab , space, new line
		//  이스케이프 문자 : 문자열 내부에 역슬래스(\)가 붙은 문자 
		// 
		System.out.println(str3);
		
		String str4 = "\\\\";
		String str5 = "\\";				// escape character .. 
		System.out.println(str4);
		System.out.println(str5);
		
		String str6 = "[ ] [\t]";		// tab
		System.out.println(str6);
		
		String str7 = "[\n]";			// new line
		System.out.println(str7);
		
		
		
	}
}
