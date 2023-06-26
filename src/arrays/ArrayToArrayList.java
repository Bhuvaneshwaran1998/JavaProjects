package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main (String args[]) {
		
		String[] animals= {"cat","ret","dog","lion"};
		
		System.out.println("Array to ArratList");
		
		List <String> d=new ArrayList<>();
		d=Arrays.asList(animals);
		
		//        (or)
		//List <String> d=Arrays.asList(animals);
		System.out.println(d);
		
		System.out.println("ArrayList to Array");
		 
		String[]s=(String[]) d.toArray(new String[d.size()]);
		for(String a:s) {
			System.out.println(a);
		}
		

		
		
		
		
		
	}

}

