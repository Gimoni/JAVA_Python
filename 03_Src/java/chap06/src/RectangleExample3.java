import java.util.Random;

import util.VT100;

public class RectangleExample3 {

	public static void main(String[] args) throws InterruptedException {

		VT100.clearScreen();
		
		Random r = new Random();
		
		for(;;) {
			
			int line 	= r.nextInt(1, 21);
			int column 	= r.nextInt(1, 41);
			int fg 		= r.nextInt(30, 38);
			int bg 		= r.nextInt(40, 48);
			char ch 	= (char) r.nextInt('A', 'Z' + 1);
			
			VT100.cursorMove(line, column);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			System.out.print(ch);
			
			Thread.sleep(1);
			
		}
		
		
		
		
//		VT100.reset();
//		VT100.cursorMove(21, 1);
//		
//		System.out.println("Program End....");
		
	}

}
