
public class FloatExample {

	/*
	 * float과 double 타입 
	 * 실수 타입에는 float과 double
	 * double타입이 float타입보다 큰 실수를 저장할 수 있고
	 * 정밀도도 높음. 
	 * - IEEE 754 : floating-point 부동소수점 
	 * 
	 */
	public static void main(String[] args) {
		float f = 3.14f;  		// float 리터럴
		double d = 3.14;		// double 리터럴
		
		f = 10/3.f;			// float은 4byte : 유효 소수 이하자리 7자리
		d = 10/3.;			// double은 8byte : 유효 소수 이하 자리 15자리
		
		System.out.println(f);
		System.out.println(d);
		
	}
}
