
public class IfStatementExample {
	
	public static void main(String[] args) {
		int score = (int)(Math.random()*50) + 51;
		
		if ( 90 <= score ) 
			System.out.printf("%3d ==> A", score);
			else if ( 80 <= score)
				System.out.printf("%3d ==> B", score);
			else if ( 70 <= score)
				System.out.printf("%3d ==> C", score);
			else if ( 60 <= score)
				System.out.printf("%3d ==> D", score);
				else 
					System.out.printf("%3d ==> F", score);
		
	}	// 코드를 간소화시키고 최적화함. 필요하지 않은 코드를 삭제하고 최소화 시킨다.
	
	public static void main7(String[] args) {
		int score = (int)(Math.random()*50) + 51;
		
		if ( 90 <= score && score <= 100) 
			System.out.printf("%3d ==> A", score);
		
			else if ( 80 <= score && score <= 90)
				System.out.printf("%3d ==> B", score);
			else if ( 70 <= score && score <= 80)
				System.out.printf("%3d ==> C", score);
			else if ( 60 <= score && score <= 70)
				System.out.printf("%3d ==> D", score);
			else if ( 0 <= score && score <= 50)
				System.out.printf("%3d ==> F", score);
			
	}	// else if를 사용해서 참이되는 블럭 하나를 수행하고 종료한다. (상호배타적)
	
	public static void main6(String[] args) {
//		int score = (int)(Math.random()*101);
		int score = (int)(Math.random()*50) + 51;
		
		if ( 90 <= score && score <= 100) 
			System.out.printf("%3d ==> A", score);
		
		if ( 80 <= score && score <= 90) 
			System.out.printf("%3d ==>B", score);
		
		if ( 70 <= score && score <= 80) 
			System.out.printf("%3d ==>C", score);
		
		if ( 60 <= score && score <= 70) 
			System.out.printf("%3d ==>D", score);
		
		if ( 50 <= score && score <= 60) 
			System.out.printf("%3d ==>E", score);
		
		if ( 40<= score && score <= 50) 
			System.out.printf("%3d ==>F", score);
	}		// 코드는 작성했지만 비효율적인 작성법... 
	
	public static void main5(String[] args) {
		int num = (int)(Math.random()*100);
		
		if (num%2 == 0) { // 출력문 statement가 두개 이상이면 반드시 {} 블럭 안에 작성해야 한다. 
			System.out.println("###");
			System.out.println("even");
			System.out.println("###");
		}
		else
			System.out.println("###");
			System.out.println("odd");
	}	// if - else 문 : 둘중 하나는 반드시 수행이 된다 _ 조건식에 따라 참과 거짓으로 수행이 됨.
	
	public static void main4(String[] args) {
		int num = (int)(Math.random()*100);
		
		if (num%2 == 0)
			System.out.println(num + " is even.");
		// 하나의 statement일 때는 {} 생략이 가능하다. 
		
		if (num%2 == 1)
			System.out.println(num + " is odd.");
	}

	public static void main3(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		System.out.println(Math.random());
		
		int num = (int)(Math.random()*10) + 1 ;		// [1 - 10]
		
		if (num%2 == 0) {
			System.out.println("### even");
			System.out.println(num + "은 짝수 입니다.");
		}
		
		if (num%2 == 1) {
			System.out.println("### odd");
			System.out.println(num + "은 홀수 입니다.");
		}
		
		System.out.println("Program End.. ");
//		System.out.println(num);
	}
	
	public static void main2(String[] args) {
		boolean b = true;
		int a = 3;
		int c = 4;
		
		
		if (b) {
			System.out.println("It works when ifstatement is true.. ");
		}

		if (a > c) {
			System.out.println("It works when ifstatement is true...");
			
		}
	}

}
