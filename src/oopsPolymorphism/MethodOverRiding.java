package oopsPolymorphism;

//Method over Riding is same different class same method different funtionality is called as Method over Riding 

class A{
	public void name(String name, int age) {
		System.out.println(name+age);
	}
	public void qulifcation(String degree, String course) {
		System.out.println(degree+course);
	}
	
}

class B extends A{
	public void name(String name,int age) {
		System.out.println(name+age+" Class B");
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.name("Bhuvanesh ",24);
		//System.out.println(b);
		b.qulifcation("B.E ", "Mech");	}

}
