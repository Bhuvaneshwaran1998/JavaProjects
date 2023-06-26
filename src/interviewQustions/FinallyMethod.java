package interviewQustions;

public class FinallyMethod {
	
	public void finalize() {
		System.out.println("collected");
	}

	public static void main(String[] args) {
		FinallyMethod fm=new FinallyMethod();
		System.out.println(fm.hashCode());
		fm=new FinallyMethod();
		System.out.println(fm.hashCode());
		System.gc();
	}

}
