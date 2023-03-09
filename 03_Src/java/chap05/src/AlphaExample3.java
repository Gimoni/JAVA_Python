
public class AlphaExample3 {

	// 배열을 사용해서 알파 화면이 전부 다 프린트되면 무한루프를 종료시킨다 how to ?
	public static void main(String[] args) throws InterruptedException {

		System.out.println("\033[2J"); // Clear screen

		boolean[][] rect = new boolean[20][40]; // false로 초기화됨 _ 화면에 출력이 되면 true.

		int forCount = 0;

		for (;;) {

			forCount++;

			int line = (int) (Math.random() * 20 + 1); // [1~20]
			int column = (int) (Math.random() * 40 + 1); // [1~40]
			int fg = (int) (Math.random() * 8 + 30); // [30-37]
			int bg = (int) (Math.random() * 8 + 40); // [40-47]
			char ch = (char) (Math.random() * 26 + 'A'); // [A~Z]

			rect[line - 1][column - 1] = true;

			System.out.printf("\033[%d;%dH", line, column);
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.printf("%c", ch);

			System.out.printf("\033[1;50H");
			System.out.printf("\033[0m");
			System.out.printf("forCount=%04d", forCount);

			boolean stop = true;

			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 40; j++) {
					if (rect[i][j] == false) { // 하나라도 출력이 안된 경우
						stop = false;
						break;
					}
				}
				if (stop==false)
					break;
			}	
			
			
			if (stop) {
				break;
			}
//			Thread.sleep(1);

		}
		System.out.printf("\033[23;1H");
		System.out.printf("\033[0m"); // reset
		System.out.printf("루프를 " + "%05d" + "번 수행했습니다.", forCount);

//		System.out.println("\033[0m");		// reset

	}
}
