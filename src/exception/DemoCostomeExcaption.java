package exception;

class CostomePasswordExcaption extends Exception{
	public CostomePasswordExcaption(String msg){
		super(msg);
		String userName="Bhuvaneshwaran";
		int password=123456;
	}
}
	
public class DemoCostomeExcaption	{
	 static void auth(String userName, int password) throws CostomePasswordExcaption{
		if(userName.equalsIgnoreCase("Bhuvaneshwaran") && password==123456) {
			//System.out.println("welcome to Office");
			throw new CostomePasswordExcaption("Welcome to office");
		}
		else {
			System.out.println("This not a cortect time ");
		}
	}
	
	public static void main(String args[]) {
		try {
			DemoCostomeExcaption.auth("Bhuvaneshwaran", 123456);
		}
		catch(CostomePasswordExcaption cp){
			System.out.println("Exception occur: "+cp);	
		}
		
		System.out.println(".........end................");
	}
	
}


