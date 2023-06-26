package operater;

public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=20;
		
		//additional Operator
		System.out.println(num1+num2);
		//sub 
		System.out.println(num1-num2);
		//multiple
		System.out.println(num1*num2);
		//division..........using (/) it will return qusionend value 
		System.out.println(num1/num2);
		// using (%) it will return a remainder value
		System.out.println(num1%num2);
		
		System.out.println("..................");
		
		int num=5;
//		num=num+5;
//		num+=5;
//		num-=2;
//		num*=2;
//		num++;
//		++num;
		System.out.println(num);
	    int	number=num++;     //it will first fatch the value and increment;
	    int numbers=++num;    //it will first increment the value and fatch the data;
		System.out.println(number);
		System.out.println(numbers);
	}

}
