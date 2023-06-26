package interviewQustions;

public class TerneryOperator {

	public static void main(String[] args) {
		// The meaning of ternary is composed of three parts. The ternary operator (? :) consists of three operands.
		// It can be used instead of the if-else statement. It makes the code much more easy, readable, and shorter.
		
		int n1=5;
		int n2=10;
		int n3=15;
		int maxnum=(n1>n2)?(n1>n3? n1:n3):(n2>n3?n2:n3);
		System.out.println(maxnum);
	}

}
