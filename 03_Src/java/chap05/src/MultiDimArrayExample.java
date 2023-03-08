
public class MultiDimArrayExample {
	
	// 다차원 배열 
	
	public static void main(String[] args) {
		boolean[][] rect = new boolean[20][40];

		for(int i=0; i<rect.length; i++) {
			for(int j=0; j<rect[i].length; j++)
				System.out.print((rect[i][j] ? 1 : 0) + ",");
			
			System.out.println();
		}
	}
	public static void main2(String[] args) {
		int[][]nums = {				// 2차원 배열 (행과열.. )
				{1, 1, 1, 1},
				{2, 2, 2, 2},
				{3, 3, 3, 3},
				{4, 4, 4, 4},
				{5, 5, 5, 5},
				
		};
		
		System.out.println(nums[2][3]);
		
		for(int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[j].length; j++)
				System.out.printf("%d,", nums[i][j]);
			
			System.out.println();
		}
		
	}
}
