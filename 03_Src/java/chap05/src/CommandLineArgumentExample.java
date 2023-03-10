
public class CommandLineArgumentExample {

	public static void main(String[] args) {
		
		for (int i =0; i<args.length; i++)
			System.out.println(args[i]);
		
		for (String arg : args)
			System.out.println("[" + arg + "]");		// 명령어에서 실행하고 확인.. 가능. 
														// cmd - java CommandLineArgumentExample Hello Hi Hola
		
		System.out.println("End...");
		
		
	}

}
