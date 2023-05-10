package 반복문;

public class ForStatementSelf {

	public static void main(String[] args) {
		String[] friends = {"Jerry","Dongsun","Dan"};
		
		for(int i=0; i<friends.length; i++) {
			System.out.println(friends[i]);
		}
		System.out.println("#######################");
		
		for(String friend : friends) {
			System.out.println(friend);
		}
	}

}
