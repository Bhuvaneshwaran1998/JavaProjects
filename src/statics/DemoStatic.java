package statics;

class Mobile{
	
	// The static keyword is used for mainly memory management 
	// using static keyWord call which help of class name -----like this(Mobile.name)
	
	String brand;
	int price;
    static String name="smartPhone";


public void show() {
	System.out.println(brand+" "+price+ " "+name);
}
}
public class DemoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m=new Mobile();
		m.brand="Apple";
		m.price=40000;
		Mobile m1=new Mobile();
		m1.brand="Sumsung";
		m1.price=25000;
	//	System.out.println(m1.brand);
	//	System.out.println(Mobile.name);

	//	System.out.println(m.brand+Mobile.name+m1.brand+Mobile.name);
		m.show();
		m1.show();
	}

}
