package interviewQustions;

//final variable......
// is a non access seifier
// If you make any variable as final, you cannot change the value of final variable(It will be constant).
class DemoFinal{
	String brand;
	int speed;
	final int speedLimit=180;
}


// final Method......
//If you make any method as final, you cannot override it.
class Demo1{
	public final void print() {
		System.out.println("final method not able to override");
	}
}
//class Demo2 extends Demo1{
//	public final void print() {
//		System.out.println("final method");
//	}
//}


//final class 
// If you make any class as final, you cannot extend it.
final class Demo3{
	String name="Bhuvanes";
}
//class Demo4 extends Demo3{
//	
//}

	


public class FinalDemo {

	public static void main(String[] args) {
// final variable		
		DemoFinal d=new DemoFinal();
		//d.speedLimit=	200;
		System.out.println(d.speedLimit);

	}

}
