package strings;

public class DemoStringBuilder {

	public static void main(String[] args) {
		
		// String Builder non-synchronized i.e. non-thread safe
		// It more efficient than StringBuffer
		// After java l.5
		
		StringBuilder sb =new StringBuilder();
		
		System.out.println(sb.capacity()); // 16 
		System.out.println(sb.append('h')); //char
		System.out.println(sb.append(" Bhuvanesh")); //String
		System.out.println(sb.reverse());
		
	}

}
