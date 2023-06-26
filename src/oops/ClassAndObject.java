package oops;

class Demo {
		
		//int a;
		public	int add(int n1, int n2) {
			//System.out.println("Hi");
		    int	total = n1+ n2;
			return total;
		}
	}

public class ClassAndObject{
	public static void main(String args[]) {
		
		Demo d=new Demo();
		
		int total=d.add(5,6);
		
		System.out.println(total);
		
	}
}

	


