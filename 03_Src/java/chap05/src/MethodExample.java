
public class MethodExample {

	public static void main(String[] args) {
		
		add(10, 5);
		add(7, 8);
	}
	
	static void add (int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a+b);
	}
	
}
