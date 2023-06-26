package forLoop;
class Revece{
	public String reverce(String a) {
		String b="";
		for(int i=a.length()-1; i>=0; i--) {
			b=b+a.charAt(i);
		}
		return b;
	}
}

public class ReverceString {
	public static void main(String args[]) {
		
		Revece r=new Revece();
		System.out.println(r.reverce("bhuvi"));
	}

}
