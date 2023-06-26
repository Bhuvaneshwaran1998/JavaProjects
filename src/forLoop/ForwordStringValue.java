package forLoop;

public class ForwordStringValue {

	public static void main(String[] args) {
		
		String name = "bhuvaneshwaran";
		String names = "bhuvaneshwaran";
		
		for(int i=0; i<=name.length()-1; i++) {
			//print same line
			System.out.print(name.charAt(i));
			
			//println next line
			//System.out.println(name.charAt(i));
		}
		
		for(int i=names.length()-1; i>=0; i-- ) {
			System.out.print(names.charAt(i));
		}

	}

}
