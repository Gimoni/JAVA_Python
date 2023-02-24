
public class CharExample {
	
	
	/*
	 * char = 2byte / 16bit /
	 * 		저장되는 값의 허용범위 : 0 ~ 65535(Unicode);
	 */
	
	public static void main(String[] args) {
		char ch = 'A';
		
		System.out.println(ch);
		
		char ch2 = 0b0100_0001;
		System.out.println(ch2);
		
		char ch3 = 97;
		ch3++;
		System.out.println(ch3);
	}

}
