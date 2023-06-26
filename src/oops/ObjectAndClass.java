package oops;

class Class{
	
	// class is like a blueprint
	
	public String name(String name1, String name2) {
		String fullName= name1.concat(name2);
	    return fullName;
   }
}


public class ObjectAndClass {

	public static void main(String[] args) {
	
		// object is a States and behaviours
		// Using new keyword create a object
		Class c=new Class();
		String name1="bhuvi";
		String name2="lolita";
		String fullName = c.name(name1, name2);

		System.out.println(fullName);
	}

}
