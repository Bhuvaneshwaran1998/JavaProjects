package statics;

public class StaticBlock {

	static  {
		System.out.println("heloo static block");
		int a=5;
		int b=4;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {	
		System.out.println("Hi am main method");

	}

}
