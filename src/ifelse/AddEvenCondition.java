package ifelse;

public class AddEvenCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		
		if(x%2==0) {
			System.out.println("is even number");
		}
		else 
			System.out.println("add number");
		
		int a=5;
		int b=0;
		if(a%2==0)
			b=10;
		else
			b=20;
		System.out.println(b);

		//ternary operator
		int num=10;
		int result=0;
		
		result= num%2==0 ? 10: 20;
		
		System.out.println(result);
		
		
	}

}
