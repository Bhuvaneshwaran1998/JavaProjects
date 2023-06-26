package arrays;

public class SingleArray {

	public static void main(String[] args) {
		
		// using array we can store the multi values in single array 
		// array having fixed memory
		// array Start's with zero place
		
		int num[]= {2,4,6,7,3};
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[4]);
	//	System.out.println(num[7]);  it shows ArrayIndexOutOfBoundsException
		System.out.println(".................");
		
		int n[]=new int[4];
		
		//System.out.println(n[2]); //not assign to any values means it will automaticly zero
		 n[0]=7;
		 n[1]=3;
		 n[2]=5;
		 n[3]=6;
		 System.out.println(n[0]);
		 System.out.println(n[1]);
		 
		 System.out.println("..........String............");
		 
		 String names[]= {"Bhuvanesh","Lolita","Sudha","Bhuvi"};
		 
		 for(int i=0; i<=names.length-1; i++) {
			 System.out.println(names[i]);
		 }
		
	}

}
