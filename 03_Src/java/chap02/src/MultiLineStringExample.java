
public class MultiLineStringExample {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = 	"Java\n" + 
						"Python\n" + 
						"Oracle\n";
		
		String str3 = """
				Java
				Python
				Oracle
				Android
				""";
		
		System.out.println(str2);
		System.out.println(str3);
		
		
	}

}
