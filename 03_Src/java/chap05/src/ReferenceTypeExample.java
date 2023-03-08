import java.util.Scanner;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		int num = 100;
		num = num*10;
		
		String str1 = "Hello";
		
	//	str1 = str1*10;	// (x) error 
	// types of reference operator  [ ==, !=, ., (string type)+]
		
		System.out.println(str1.length());
		
		System.out.println(str1 == "Hello");
		System.out.println(str1 != "Hello");
		
		System.out.println(str1 + num); 	// string concatenation. 문자열 연결 +
		
		Scanner scan = new Scanner(System.in);	// 
		
		System.out.println(scan == scan);
		System.out.println(scan != scan);
		
		
	}

}
