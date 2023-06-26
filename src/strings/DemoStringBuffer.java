 package strings;

public class DemoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using String Buffer we can mute the String values
		// String Buffer is synchronized i.e. thread safe
		// less efficient than StringBuilder
		// Starting Stage 
		
		StringBuffer sb =new StringBuffer("Bhuvanesh");
		System.out.println(sb.capacity()); // empty space is 16
		System.out.println(sb);
		System.out.println(sb.append(" Lolita"));
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(5));
		System.out.println(sb.length());
		System.out.println(sb.insert(0, "Hello "));
		System.out.println(sb.deleteCharAt(5));
		System.out.println(sb.substring(5));
		

	}

}
