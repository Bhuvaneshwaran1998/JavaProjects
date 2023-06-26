package statics;


class Fan{
	String brand;
	int price;
	static String type = "ElecticFan";
	
	public static void show(Fan f) {
		System.out.println(f.brand+" "+f.price+" "+type);
	}
}
  
     // inside static method we not able call non Static varibles
     // using instance varible can call the values
     // using class name we can call the static method;
     // can not be override

// static block exc only ones before the  exq of the main method
// the static block properties are loaded before the main method

public class DemoStaticMethod {

	public static void main(String[] args) {
		
		Fan f1=new Fan();
		
		f1.brand="Bajaj";
		f1.price=2000;
		
		Fan f2=new Fan();
		f2.brand="cromo";
		f2.price=1000;
        
		System.out.println("hii");
		Fan.show(f1);
		Fan.show(f2);
	}

}
