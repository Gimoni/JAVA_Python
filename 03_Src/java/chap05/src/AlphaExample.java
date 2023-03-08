
public class AlphaExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("\033[2J");		// Clear screen
		
		int [][] board= new int [20][40];
		int forCount=0;
		
		for (;;) {
			
			forCount++;
			for (int i=0; i<board.length; i++) {
				for(int j=0; j<board[i].length; j++)
					if(i<=forCount) {
						break;
					}
				System.out.printf("\033[28;2H");
				System.out.printf("\033[0m");
				System.out.printf("루프를 " + "%05d" + "번 수행하고 있지만 멈출 수 없습니다. ", forCount);
			}
			System.out.printf("\033[25;2H");
			System.out.printf("\033[0m");
			System.out.printf("루프를 " + "%05d" + "번 수행하고 있습니다.", forCount);
			
			int line	= (int)(Math.random()*20 + 1); 	// [1~20]
			int column	= (int)(Math.random()*40 + 1); 	// [1~40]
			int fg 		= (int)(Math.random()*8 +30);	// [30-37]
			int bg 		= (int)(Math.random()*8 +40);	// [40-47]
			char ch = (char)(Math.random()*26 + 'A'); 	// [A~Z]
			
			System.out.printf("\033[%d;%dH", line, column);
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.printf("%c", ch);
			
			System.out.printf("\033[1;50H");
			System.out.printf("\033[0m");
			System.out.printf("forCount=%04d", forCount);
			
			Thread.sleep(10);
			
		} 
		
		
		
		
//		System.out.println("\033[0m");		// reset
				
	}
}
