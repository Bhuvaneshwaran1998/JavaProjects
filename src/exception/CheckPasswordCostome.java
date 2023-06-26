package exception;

class PasswordException extends Exception {
	public PasswordException(String msg) {
		super(msg);
	}
}

public class CheckPasswordCostome {
	public static void main(String args[])throws PasswordException{
		String password="bhuvaneshwaran";
		try {
			if(password.length()>=15) {
				System.out.println("succesfully login");
			}
			else {
				throw new PasswordException("user is not part of team");
			}
		}catch(PasswordException pe){
			System.out.println(pe);
		}
		
		System.out.println(".................end....................");
		
	}
}
