package collactionArrayList;

import java.util.ArrayList;

class Bike{
	
	private String brand;
	private int price;
	private int wight;
	private int speed;
	
	
	public Bike(String brand, int price, int wight,int speed) {
		this.brand=brand;
		this.price=price;
		this.wight=wight;
		this.speed=speed;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getWight() {
		return wight;
	}


	public void setWight(int wight) {
		this.wight = wight;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", wight=" + wight + ", speed=" + speed + "]";
	}
	
	
	
	
	
}




public class UseBike {

	public static void main(String[] args) {
		
		Bike b1=new Bike("KTM",300000,150,390);
		Bike b2=new Bike("R.E",200000,250,350);
		Bike b3=new Bike("RX100",160000,100,100);
		
		ArrayList b=new ArrayList<>();
		
		b.add(b3);
		b.add(b2);
		b.add(b1);
		
		System.out.println(b);

	}

}
