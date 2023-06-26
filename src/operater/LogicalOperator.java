package operater;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int x=5;
		int y=10;
		
		//and operator (&&) both of correct is show true are else false 
		boolean result = a>b && x>y;
		System.out.println(result);
		
		boolean result1= a<b && x<y;
		System.out.println(result1);
		
		boolean result2= a>b && x<y;
        System.out.println(result2);
        
        System.out.println(".........................");
        
        //are operator (||) either one is correct is slow true are else false
        boolean result3= a<b || x<y;
        System.out.println(result3);
        
        boolean result4= a>b || x>y;
        System.out.println(result4);
        
        boolean result5= a>b || x<y;
        System.out.println(result5);
	}

}
