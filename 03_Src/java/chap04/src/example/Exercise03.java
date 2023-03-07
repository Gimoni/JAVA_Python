package example;

public class Exercise03 {
//	[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오. 
	
	public static void main(String[] args) {
		
		int totalSum = 0; 
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			sum += i; 
			
			totalSum += sum;
		}
		
		System.out.println("sum = " + totalSum);
	}
	
	public static void main2(String[] args) {
		
		int sum = 0;
		
		for (int i=1; i <=10; i++) {
			int s = 0;
			for (int j=1; j<=i; j++) 
				s += j;
				
			sum += s;
			
		}
		System.out.println("sum = " + sum);
		
	}

}
