
public class ForFloatExample {
	
	// 초기화식에서 부동 소수점을 쓰는 float타입을 사용하지 않도록 주의 : 
	// for 문의 초기화식에 실수를 사용해서는 안된다... 
	public static void main(String[] args) {
		for (double d=0.0; d<1; d+=0.1) { // float type refuse to use it
			System.out.println(d);
			
			if (d == 0.8)
				System.out.println("0.8 입니다");
			// there's no 0.8 can see tho. 
			
		}
	}
}
