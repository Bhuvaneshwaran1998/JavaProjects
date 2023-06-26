package oopsEnhanced;

      //Encapsulation is a process of wrapping code and data together into a single unit which help of private keyWord
     
      // this--KeyWords  There can be a lot of keywords. In Java, this is a reference variable that refers to the current object.


class Demo {
	private String brand;
	private int price;
	private String colour;
	private int speed;
	
	
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
	
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d=new Demo();
		
		d.setBrand("Maruthi");
		d.setColour("bule");
		d.setPrice(500000);
		d.setSpeed(150);
		System.out.println("Brand :"+d.getBrand()+" Price :"+d.getPrice()+" Colour :"+d.getColour()+" Speed :"+d.getSpeed());
		//System.out.println(d.getColour());
	}

}
