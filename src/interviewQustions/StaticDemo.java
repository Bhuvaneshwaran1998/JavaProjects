package interviewQustions;

class Demo {
	
	//Static variable
	static String fName="velmurugan";
	String name;
	int age;

	/*
	  public void show() {
	     System.out.println(name+age+fName);
	 }
	 */
	public String show1() {
		return name+age+fName;
	}
	//--------------------------------------------------
     
    // static method
    // we need to pass the inside of method class name
	
//     public static void shows(Demo d) {
//    	 System.out.println(d.name+d.age+fName);
//     }
     
     public static String shows1(Demo d) {
    	return d.name+d.age+fName; 
     }
     
}
	
public class StaticDemo{
public static void main (String[] args) {
	
	Demo d1=new Demo();
	d1.name="Bhuvi";
	d1.age=24;
	
	Demo d2=new Demo();
	d2.name="Sudha";
	d2.age=18;
// static variable.........
	//d1.show();
	//d2.show();
	System.out.println(d1.show1());
	
// static method......	
	//Demo.shows(d1);
	//Demo.shows(d2);
	System.out.println(Demo.shows1(d2));
	
	}

}
