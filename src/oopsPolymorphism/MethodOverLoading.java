package oopsPolymorphism;

class OverLoading{
	
	// Method over Loading is same class same method name different funtionality is called as Method over Loading 
	
	//befour method using string it will accept all Data types
	public String mobile(String brand) {
		return brand;
	}
	
	public String mobile(String brand,int price, float inch, double totalAmount) {
		return brand+price+inch+totalAmount;
	}
	
	public String mobile(String brand,int price,int size,boolean isWaterProof) {
		return brand+price+size+isWaterProof;
	}
	// using double expcet String it will accept all DataTypes
	
	public double mobile(int price,double size,float inch) {
		return price+size+inch;
		
	}
	
	//using int it will accept only byte int short data types
	
	public int mobile(int price, int size, byte inch) {
		return price+size+inch;
	}
	
}




public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoading ol=new OverLoading();
		String mobileDetils=ol.mobile("RealMe ", 14000 , 6, false);
		System.out.println(mobileDetils);
		System.out.println(ol.mobile("Apple"));
		System.out.println(ol.mobile("Apple ", 40000, 5.7f, 0.2));
		System.out.println(ol.mobile(2000, 3000, 0.2f));
		
	
	}

}
