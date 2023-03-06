
public class ContinueBreakExample {

	/*
	 *  epoch time 에폭시 타임
	 *  1970-01-01 00:00:00 부터 경과시간
	 *
	 */
	public static void main4(String[] args) {
		long epoch = System.currentTimeMillis()/1000;
		
		int year = 0; 
		
//		for (int i=1970; ; i++) {
//			
//		}
		
		for (int i =1970; i<Integer.MAX_VALUE; i++) {
			int day = (i%4==0 && i%100!=0 || i%400==0) ? 366 : 365;
			int second = day*24*60*60; 
			
			if (epoch-second >=0) {
				epoch = epoch - second;
				continue;
				
			}
			
			year = i;
			break;
		}
		
		System.out.println(year);
		
	}
	
	
	
	public static void main3(String[] args) {
		
		int sum = 0; // 3의 배수의 합을 구하기
		
		for (int i=1; i<=100; i++) {
			
			if (i%3!=0)
				continue;
			
			sum += i;
			
		}
		
		System.out.println(sum);
	}
	
	public static void main2(String[] args) {

		int cnt =0;
		for(int i=0; i<100; i++) {
			cnt++;
			if (i == 9)
				break;
		}
		
		System.out.println(cnt);
	}

}
