package example;

import java.util.Scanner;

public class Exercise14 {
	
	
	public static void main(String[] args) {
		int answer= (int)(Math.random()*100 +1);
		int input =0;
		int count =0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이에 값을 입력하세요 :");
			input = scan.nextInt();
			
//			System.out.println("입력한 값은" + input + "입니다.");
			
			if (answer>input) {
				System.out.println("입력한 값은" + input + "입니다.");
				System.out.println("더 큰 수를 입력하세요 :");
			}else if (answer<input) {
				System.out.println("입력한 값은" + input + "입니다.");
				System.out.println("더 작은 수를 입력하세요 :");
			}else {
				System.out.println("입력한 값은" + input + "입니다.");
				System.out.println("맞췄습니다");
				System.out.println("시도 횟수는 " + count + " 입니다.");
				break;
			}
			
		} while (true);
	}
	
	public static void main2(String[] args) {
		int answer= (int)(Math.random()*100 +1);
		int input =0;
		int count =0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이에 값을 입력하세요.");
			input = scan.nextInt();
			
			System.out.println("입력한 값은" + input + "입니다.");
			
			if(answer==input) {
				System.out.println("정답입니다.\n");
			}else if (answer>input) {
				System.out.println("더 큰 수를 입력하세요");
			}else if (answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			
		} while (true);
	}
	
}
