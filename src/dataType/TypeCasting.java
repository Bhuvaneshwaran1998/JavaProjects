package dataType;

public class TypeCasting {

	public static void main(String[] args) {
		
		// lower D-T to higher D-T(DataType) it will work properly...... 
		byte b=127;
		int i =b;
		System.out.println(i);
		
// higher DT to lower DT it will shows compile time error like Type Mismatch
//		int i1= 256;
//		byte b1=i1;
//		System.out.println(b1);

		// Use Type Casting we can get the values like time.... but it shows remainder values
		int i2=258;
		byte b2=(byte)i2;
		System.out.println(b2);
		
		long l=1234567890;
		int i3=(int)l;
		System.out.println(i3);
		
		float f=23.4f;
		long l2=(long)f;
		System.out.println(l2);
		
//		//Type promotion
//		//byte not accept int values
//		byte b3=20;
//		byte b4=20;
//		byte reuslt=b3*b4;
//		System.out.println(reuslt);
		
		byte b3=20;
		byte b4=40;
		int result =b3*b4;
		System.out.println(result);

	}

}
