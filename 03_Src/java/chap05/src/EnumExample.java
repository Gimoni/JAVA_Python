import java.time.DayOfWeek;

enum Gender {
	MALE, FEMALE, 
}

enum Month {
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}

enum Week {
	MONDAY,	TUESDAY, WEDESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumExample {

	public static void main(String[] args) {
		
		Gender g = null; 
		g = Gender.MALE;
		
		Gender g2 = Gender.FEMALE;
		
		Month o = Month.OCT;
		
		Week w = Week.WEDESDAY;
		
		DayOfWeek week = DayOfWeek.FRIDAY;
		
		
		
	}
}
