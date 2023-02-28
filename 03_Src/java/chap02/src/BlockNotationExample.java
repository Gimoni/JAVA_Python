
public class BlockNotationExample {

	/*
	 * 블럭 안에 선언된 변수는 블럭 안	에서만 유효하다.
	 */
	public static void main(String[] args) {
		int num = 10; 
		{
			int num2 = 20; 
			{
				{
					{
						
					}
				}
				System.out.println(num2);
			}
		}
		
		System.out.println(num);
//		System.out.println(num2);	
	}
	

	public static void main2(String[] args) {
		
		
	}

}
