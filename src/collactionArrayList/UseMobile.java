package collactionArrayList;

import java.util.ArrayList;

class Mobile{
	String brand;
	int price;
	float size;
	boolean isWaterProof;
	
    
	public Mobile(String brand, int price, float size, boolean isWaterProof) {
		
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.isWaterProof = isWaterProof;
	}


	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", size=" + size + ", isWaterProof=" + isWaterProof
				+ "]";
	}
}

public class UseMobile {

	public static void main(String[] args) {
		
		Mobile m1=new Mobile("Apple",45000,5.5f,true);
		Mobile m2=new Mobile("sumsung",25000,5.7f,true);
		Mobile m3=new Mobile("realme",15000,6,true);
		
		ArrayList<Mobile> m = new ArrayList<>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		
		System.out.println(m.size());     // size method show the size of arrayList
		System.out.println(m.get(0).brand+m.get(0).price);  //get Method is used to get the values
		System.out.println(m.get(1));
		System.out.println(m.clone());
		System.out.println(m.contains(m2));  // contains Method is used to  check the object is there are not
		System.out.println(m.equals(m1));
		System.out.println(m.hashCode());
		System.out.println(m.lastIndexOf(m3)); //which help of this find out the index position
		System.out.println(m.remove(m3));   // remove method it is used to remove the object
		System.out.println(m);
		System.out.println(m.set(1, m3));  //set the object values in index position
		System.out.println(m.get(1));
		
		
	}

}
