
public class ForStatementExample {
	

	
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			char ch = (char)(Math.random()*26 +'A');
			System.out.print(ch);
		}
		
	}
	
	/*
	 * 1+2+3+4+5+6+7+8+9+10
	 */
	
	public static void main7(String[] args) {
		// 1부터 10까지 더하다. 
		int sum = 0;
				
		for (int i=1; i<=10; i++) {
//			System.out.println(i);
			sum = sum + i;
		}
		
		System.out.println("sum =" + sum);
	}
	
	public static void main6(String[] args) {
		
		int i =1;
		i++; System.out.println(i);
		i++; System.out.println(i);
		i++; System.out.println(i);
		i++; System.out.println(i);
		i++; System.out.println(i);
		i++; System.out.println(i);
		i++; System.out.println(i);
		i++; System.out.println(i);
		i++; System.out.println(i);
		
	}
	
	public static void main5(String[] args) {
		
		for (int i=0; i<10; i++) { 	// for(초기화식, 조건식, 증감식)
			System.out.println(i);
		}
	}
	
	public static void main4(String[] args) {
		for (int i=0;; i=i+100) {
			System.out.println(i);
		}
	}
	
	
	public static void main3(String[] args) {
		
		for(int i=0;;) {	// 초기화문 ( 딱 한번 수행됨 )
			
			System.out.println(i);
		}
		
		
	}
	
	public static void main2(String[] args) {
		
		for(;;) {	// infinity 무한반복 ;;
			System.out.println("...");
		}
		
	}

}
