
public class RandomExample {

	public static void main(String[] args) {
		char ch = ' ';
		
		switch ((int)(Math.random()*5)) {
		case 0, 3 -> ch = (char)(Math.random()*10 +'0');
		case 1, 4 -> ch = (char)(Math.random()*26 +'A');
		case 2 -> ch = (char)(Math.random()*26 +'a');
		
		}
		
		System.out.println("ch = " + ch);
		
		if (ch >= '0' && ch <= '9')
			System.out.println("Number");
		else if (ch >= 'A' && ch <= 'Z')
			System.out.println("Uppercase");
		else
			System.out.println("Lowercase");
		
	}
	
	public static void main4(String[] args) {
		char ch = ' ';	 // 변수 초기화.
		
		switch ((int)(Math.random()*5)) {
		case 0:				//switch case fall through
		case 3:
			ch = (char)(Math.random()*10 + '0');
			break;
		case 1:
		case 4:
			ch = (char)(Math.random()*26 + 'A');
			break;
		case 2:
			ch = (char)(Math.random()*26 + 'a');
		default:
			break;
		}
		
		System.out.println("ch = " + ch);
		
		if (ch >= '0' && ch <= '9')
			System.out.println("Number");
		else if (ch >= 'A' && ch <= 'Z')
			System.out.println("Uppercase");
		else
			System.out.println("Lowercase");
	}
	
	public static void main3(String[] args) {
		
		int group = (int)(Math.random()*3);
		char ch ;
		
		if (group==0)
			ch = (char)(Math.random()*10 +'0');
		else if (group==1)
			ch = (char)(Math.random()*26 + 'A');
		else
			ch = (char)(Math.random()*26 + 'a');
		
		System.out.println(ch);
	}
	
	
	public static void main2(String[] args) {
		
		int group = (int)(Math.random()*3);
		char ch = group==0 ? (char)(Math.random()*10 + '0') : 
					group==1 ? (char)(Math.random()*26 + 'A'):
								(char)(Math.random()*36 + 'a');
		
		System.out.println(ch);
		
	}
	
	public static void main1(String[] args) {	// 대문자/소문자 알파벳, 숫자 랜덤 생성. 
//		char ch = (char)((Math.random()*26) + 'A');
//		char ch = (char)((Math.random()*26) + 'a');
		char ch = (char)((Math.random()*10) + '0');
		System.out.println(ch);
	}

}
