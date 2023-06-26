package exception;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);           // calling the constructor of parent Exception
	}
}


public class TestCustomException1 {

	static void validate(int age) throws InvalidAgeException {
		
		if (age < 18) {                                            // throw an object of user defined exception
			throw new InvalidAgeException("age is not valid to vote");
		} 
		else {
			System.out.println("welcome to vote");
		}
	}

	// main method
	public static void main(String args[]) {
		try {
			// calling the method
			validate(10);
		} catch (InvalidAgeException ex) {
			System.out.println("Exception occured: " + ex);
		}

		 finally {
			System.out.println("run the program");
		}
	}
}
