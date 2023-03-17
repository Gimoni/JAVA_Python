import util.VT100;

public class RectangleExample2 {

	public static void main(String[] args) throws InterruptedException {

		VT100.clearScreen();
		
		boolean[][] rect = new boolean[20][40];	// false/true
		int[][][] saveRect = new int[3][20][40];
		
		int forCount = 0;
		int count = 0;
		
		for (;;) {
			forCount++;
			
			int line 	= (int)(Math.random()*20 + 1); // [1-20]
			int column 	= (int)(Math.random()*40 + 1); // [1-40]
			int fg = 0;
			int bg = 0;
			
			do {
				fg 		= (int)(Math.random()*8 + 30); // [30-37]
				bg 		= (int)(Math.random()*8 + 40); // [40-47]				
			} while (fg + 10 == bg);
			
			char ch = (char)(Math.random()*26 + 'A');
			
		    VT100.cursorMove(line, column);
		    VT100.setForeground(fg);
		    VT100.setBackground(bg);
		    System.out.println(ch);
		    
		    int li = line - 1;
			int ci = column - 1;
			saveRect[0][li][ci] = ch;
			saveRect[1][li][ci] = fg;
			saveRect[2][li][ci] = bg;
		    
			if (rect[line-1][column-1] == false) {
				rect[line-1][column-1] = true;
				count++;
				VT100.cursorMove(22, 1);
				VT100.reset();
				System.out.printf("count = %03d", count);
			}
			
			VT100.cursorMove(21, 1);
			VT100.reset();
			System.out.printf("forCount=%04d", forCount);
			
			if (count==800)
				break;
			
			Thread.sleep(1);
			
		}
		
		VT100.cursorMove(43, 1);
		VT100.reset();
		VT100.cursorMove(21, 1);
		
		System.out.println("Program End....");
		
	}

}
