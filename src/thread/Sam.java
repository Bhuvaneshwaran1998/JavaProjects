package thread;

public class Sam extends Thread {
	public void run() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Sam t=new Sam();
		t.start();
	}
}
