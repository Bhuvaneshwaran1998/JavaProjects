package oops;

class Demos{
	
	public void print() {
		
		// using void we can give values in Sysout and call the method in our main class
		
		System.out.println("Hello Bhuvi");
	}
	
	public String detils(String name, String quli ) {
		
		//using String are int we need to right return must and call the method in main class using Sysout
		
	    String detil=name.concat(quli);
		return detil;
	}
	
	
	public String bike(String brand, int price, String colour, boolean isPetrol) {
		
		if(brand.equalsIgnoreCase("ktm")) {
			return brand+price+colour+isPetrol;
		}
		else 
			return "is not a ktm bike";
		
	}
	
	public void bike(String brand,int price,String colour) {
		//System.out.println(brand+price+colour);
		System.out.println("duke"+200000+"white");
	}
}



public class DiffTypeMethods {

	public static void main(String[] args) {

		Demos d =new Demos();
		d.print();
		//d.bike("Royel Emfild ", 200000, " AramyColour");
		d.bike(null, 0, null);
		String detil=d.detils("bhuvan", " B.E");
		System.out.println(detil);
		System.out.println(d.detils("Lolita ", "B.E"));
		System.out.println(d.bike("Appache", 200000, "block", true));
		System.out.println(d.bike("KTM", 220000, " white ", true));
	}

}
