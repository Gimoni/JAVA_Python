
public class AlphaExample7 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\033[2J");	// Clear Screen
		
		boolean[][] rect = new boolean[20][40];	// false/true
		int[][][] saveRect = new int[3][20][40];
		
		int forCount=0;
		int count=0;
		
		// 1
		for (;;) {
			forCount++;
			
			int line 	= (int)(Math.random()*20 + 1); // [1-20]
			int column 	= (int)(Math.random()*40 + 1); // [1-40]
			int fg=0;
			int bg=0;
			
			do {
				fg 		= (int)(Math.random()*8 + 30); // [30-37]
				bg 		= (int)(Math.random()*8 + 40); // [40-47]
			} while(fg + 10 == bg);
			
			char ch 	= (char)(Math.random()*26 + 'A'); // [A-Z]
			
			System.out.printf("\033[%d;%dH", line, column);
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.printf("%c", ch);
			
			int li = line - 1;
			int ci = column - 1;
			saveRect[0][li][ci] = ch;
			saveRect[1][li][ci] = fg;
			saveRect[2][li][ci] = bg;
			
			if (rect[line-1][column-1] == false) {
				rect[line-1][column-1] = true;
				count++;
				System.out.print("\033[22;1H");
				System.out.print("\033[0m");
				System.out.printf("count = %03d", count);
			}
			
			System.out.printf("\033[21;1H");
			System.out.printf("\033[0m");
			System.out.printf("forCount=%04d", forCount);
			
					
			if (count==800)
				break;
			
//			Thread.sleep(1);
			
		}
		
		// 2
		for (int i=0; i<20; i++) {
			for (int j=0; j<40; j++) {
				int line = i + 1;
				int column = j + 1;
				char ch = (char)saveRect[0][i][j];
				int fg = saveRect[1][i][j];
				int bg = saveRect[2][i][j];
				
				System.out.printf("\033[%d;%dH", line, column + 50);
				System.out.printf("\033[%dm", fg);
				System.out.printf("\033[%dm", bg);
				System.out.printf("%c", ch);
				
				Thread.sleep(10);
			}
		}
		
		// 3
		for (int j=0; j<40; j++) {
			for (int i=0; i<20; i++) {
				int line = i + 1;
				int column = j + 1;
				char ch = (char)saveRect[0][i][j];
				int fg = saveRect[1][i][j];
				int bg = saveRect[2][i][j];
				
				System.out.printf("\033[%d;%dH", line + 22, column);
				System.out.printf("\033[%dm", fg);
				System.out.printf("\033[%dm", bg);
				System.out.printf("%c", ch);
				
				Thread.sleep(10);
			}
		}
		
		// 4
		for (int j=39; j>=0; j--) {
			for (int i=19; i>=0; i--) {
				int line = i + 1;
				int column = j + 1;
				char ch = (char)saveRect[0][i][j];
				int fg = saveRect[1][i][j];
				int bg = saveRect[2][i][j];
				
				System.out.printf("\033[%d;%dH", line + 22, column + 50);
				System.out.printf("\033[%dm", fg);
				System.out.printf("\033[%dm", bg);
				System.out.printf("%c", ch);
				
				Thread.sleep(10);
			}
		}
		
		System.out.print("\033[43;1H");
		System.out.print("\033[0m");	// reset
		System.out.print("End...");
		
	}

}
