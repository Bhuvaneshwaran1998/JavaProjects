package ifelse;

public class SingleCondition {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Bhuvaneshwaran";
		
		if(name.length()!=14)
			System.out.println("your name length is corrtect");
		else
			System.out.println("name length is worng");
	
		
		int age=20;
		if(age<25) {
			System.out.println("not ready to marriage");
			System.out.println("your a under Age");
		}
		else 
			System.out.println("ready to marriage");

		
		int mark=90;
		int total=100;
		int love=mark/100*total;
		
		if(love>80 && love>=89) {
			System.out.println("your love is unstable");
		}
		else {
			System.out.println("your love is stable");
		}
		
		
		
	}	

}
