
public class YeapExample {

	public static void main(String[] args) {
		
		for (int year=1; year<2030; year++ ) {
			if (year%4==0 && year%100!=0 || year%400==0)
				System.out.printf("%04d == 윤년****\n" , year);
			else 
				System.out.printf("%04d == 평년\n" , year);
		}
		
	}

}
