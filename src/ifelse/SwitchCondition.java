package ifelse;

public class SwitchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String time ="12.30PM";
		
		switch (time) {
		case "1Am to 6am":
			System.out.println("mide night");
			break;
		case "6.1Am to 12Pm":
			System.out.println("good morning");
			break;
		case "12.1PM to 4.30PM":
			System.out.println("good afternoon");
			break;
		case "4.30PM to 8.30PM":
			System.out.println("good night");
			break;
		default	:
		
		System.out.println("involid time");
		
		
		}
	}

}
