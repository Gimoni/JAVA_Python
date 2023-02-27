import java.util.Random;

public class RandomExample {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("\033[0m");
		System.out.println("\033[2J");
		
		Random r = new Random(100);
		
		for(;;) {
			int line = r.nextInt(20) + 1;
			int column = r.nextInt(40) + 1;
			int fg = r.nextInt(8) + 30;
			int bg = r.nextInt(8) + 40;
			char ch = (char)(r.nextInt(26) + 'A');
			
			System.out.printf("\033[%d;%dH", line, column);
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.println(ch);
			Thread.sleep(10);
			
		}
	}

}
