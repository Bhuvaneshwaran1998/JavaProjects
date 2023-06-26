package arrays;

class Demo{
	
	String name;
	int age;
	String qulifcation;
}

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d1=new Demo();
		d1.name="Bhuvanesh";
		d1.age=24;
		d1.qulifcation="B.E-Mech";
		
		Demo d2=new Demo();
		d2.name="Lolita";
		d2.age=25;
		d2.qulifcation="B.E-EcE";
		
		Demo d3=new Demo();
		d3.name="Sudha";
		d3.age=17;
		d3.qulifcation="MBBS";
		
		Demo d[]=new Demo[3];
		d[0]=d1;
		d[1]=d2;
		d[2]=d3;
			
		System.out.println(d); // print the address 
	
		System.out.println("...........enhanced Method...........");
		
		for(Demo n:d) {
		System.out.println(n.name+" "+n.age+" "+n.qulifcation);
		}
		
		for(int i=0; i<=d.length-1; i++) {
			System.out.println(d[i].name+" "+d[i].qulifcation);
		}
		
		
		
		
		
	}

}
