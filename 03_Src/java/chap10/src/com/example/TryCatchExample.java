package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 예외 처리 Exception handling 
 * 
 * 
 */
public class TryCatchExample {
	
	public static void main(String[] args) {
		/*
		 * try-with-resources
		 * 
		 * mian 10의 간소화/ finally 삭제. 리소스 자동 닫기
		 * 리소스 : 데이터 제공 객체 
		 * 예외 발생 여부와 상관없이 리소스를 자동으로 닫아줌. (자동종료)
		 */
		try (Connection conn = DriverManager.getConnection("", "", "");){

			var stmt = conn.createStatement();
			stmt.executeQuery("select * from dual");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main10(String[] args) {
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("", "", "");
			
			var stmt = conn.createStatement();
			stmt.executeQuery("select * from dual");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	
	public static void main9(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		for (;;) {
			System.out.print("당신의 나이를 입력하시오");	
			Integer age = null;
			
			try {
				age = scan.nextInt();
				System.out.println( age + "세 이시군요... ㅎ ");
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("숫자가 아닙니다");
				System.out.println("나이는 숫자로 입력하세요.");
				scan.nextLine();	//
			}
		}
		
		System.out.println("End..");
	}
	
	public static void main8(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("당신의 나이를 입력하시오");
		
		Integer age = null;
		
		try {
			age = scan.nextInt();
			System.out.println( age + "세 이시군요... ㅎ ");
			
		} catch (InputMismatchException e) {
			System.out.println("숫자가 아닙니다");
			System.out.println("나이는 숫자로 입력하세요.");
		}
		
	}	
	
	
	public static void main7(String[] args) {
		//Unhandled exception type SQLException
		
		System.out.println("Start...");
		
		try {
			// 입출력을 받는 io : checked exception
			DriverManager.getConnection("" , "", "");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("지금은 접속할 수 없습니다. ");
			System.out.println("5분 후에 재접속할 수 있습니다.  ");
		}
	
		System.out.println("End... ");
		
	}

	public static void main6(String[] args) {
		
		System.out.println("Start...");
		
//			Thread.sleep(5000);
	
		System.out.println("End... ");
		
	}
	
	
	public static void main5(String[] args) throws InterruptedException {
		// checked exception 예외 처리
		// add throws declaration
		
		System.out.println("Start...");
		
			Thread.sleep(5000);
	
		System.out.println("End... ");
		
	}
	
	
	
	public static void main4(String[] args) {
		// unhandled exception : checked exception 예외 처리 try - catch 
		
		System.out.println("Start...");
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
		
		System.out.println("End... ");
	}
	
	
	
	public static void main3(String[] args) {
		// 다중 catch로 예외 처리
		
		int x = 3;
		String str = "Hello";
		
		try {
			int result = 10/x;	// ArithmeticException		
			
			str.charAt(0);		// NullPointerException
			
			int[] nums = {1, 2, 3};
			nums[3] = 10;
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
//			e.printStackTrace();	// error print 
		} catch (NullPointerException e) {
			System.out.println("Null 입니다. Null은 연산할 수 없습니다.");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block's always working.");
		}
		
		System.out.println("End.. ");
		
	}
	
	
	
	public static void main2(String[] args) {
		// try-catch 예외 처리 
		
		System.out.println("start");
		System.err.println("start");		// err type print
		System.out.println("start");
		
		try {
			int result = 10/0;		// runtime exception을 조상으로 둔 예외클래스. 
		} catch (ArithmeticException e) {
			
		}
		
		
		
		
		System.out.println("End.. ");
		
	}

}
