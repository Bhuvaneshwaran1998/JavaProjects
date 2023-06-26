package forLoop;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city = "malayalam";
		String temp ="";
		for(int i=city.length()-1; i>=0; i--) {
			temp =temp+city.charAt(i);
		}
		if(city.equals(temp)) {
			System.out.println("is palidrome");
		}
		else {
			System.out.println("is not palidrom");
		}
		
	}

}
