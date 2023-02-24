
public class UnderflowExample {

	public static void main(String[] args) {
		byte b = Byte.MIN_VALUE;
		
		b--;			// Underflow 
		
		System.out.println(b);
		
	}

}
