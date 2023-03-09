
public class ThreeDimArrayExample2 {

	public static void main(String[] args) throws InterruptedException {
		int[][][] alphas = new int[3][4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				alphas[0][i][j] = (char) (Math.random() * 26 + 'A');
				alphas[1][i][j] = (int) (Math.random() * 8 + 30);
				alphas[2][i][j] = (int) (Math.random() * 8 + 40);
			}
		}

		for (int i = 0; i < alphas.length; i++) {
			for (int j = 0; j < alphas[i].length; j++) {
				for (int k = 0; k < alphas[i][j].length; k++) {
					if (i==0)
						System.out.printf("%c,", (char)alphas[i][j][k]);
					else if (i==1) {
						System.out.printf("\033[%dm", alphas[i][j][k]);
						System.out.printf("%d,", alphas[i][j][k]);
					}
					else if (i==2) {
						System.out.printf("\033[%dm,", alphas[i][j][k]);
						System.out.printf("%d,", alphas[i][j][k]);
					}
				}
				System.out.printf("\033[0m");
				System.out.println();
			}
			System.out.println();
		}
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<5; j++) {
				char ch = (char)alphas[0][i][j];	// [0]이 먼저 연산됨. 그 이후에 char로 캐스팅 
				int fg = alphas[1][i][j];
				int bg = alphas[2][i][j];
				
				System.out.printf("\033[%dm", fg);
				System.out.printf("\033[%dm", bg);
				System.out.printf("%c", ch);
				Thread.sleep(1000);
			}
			System.out.printf("\033[0m");
			System.out.println();
		}
		
		
	}
}
