package oopsConsturtor;


// It is a special type of method which is used to initialize the object

class Demo{
	
	private String style;
	private int price;
	private String type;
	
	
	public Demo(String style, int price, String type) {
		super();
		this.style = style;
		this.price = price;
		this.type = type;
	}
	
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=new Demo("westen",1000000,"Big");
		Demo d1=new Demo("northen",2000000,"small");
		
		System.out.println(d.getStyle()+d.getPrice()+d.getType());
	}

}
