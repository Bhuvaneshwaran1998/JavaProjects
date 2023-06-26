package interviewQustions;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// The wrapper class is a mechanism of to convert primitive into object and object into primitive
		
//AutoBox  is  primitive into object 
		int num=20;
		Integer i =Integer.valueOf(num);
		Integer j=num;
		
		System.out.println(j);
		System.out.println(num);
		System.out.println(i);

//unBox object into primitive
		Integer a =new Integer(5);
		int b=a.intValue();
		int c=b;
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
	}

}
