package thread;

public class Simple implements Runnable {

	public void run() {
		System.out.println("Hi");
	}

	public static void main(String args[]) {

		Simple s= new Simple(); 
		Thread t=new Thread(s);
		t.start();
		System.out.println("main thread");
		
	}
}
