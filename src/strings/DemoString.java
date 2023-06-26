package strings;

public class DemoString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		// String is sequency of character in double codes ("")
		//String is a class in java
		// String naturaly immutable
		// there are two ways to decleare a string ---1.String literal  2.by using new keyword 
		//
		// using String buffer and String builder we can mutable String
		
		
		String name= "Bhuvanesh";
		System.out.println(name.hashCode());
		System.out.println(name);
		
		
		System.out.println(".........String Object..........");
		
		String names =new String("Bhuvi" +" lolita");
		names="bhuvi";
		
		System.out.println(names);

	}

}
