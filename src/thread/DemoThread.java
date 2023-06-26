package thread;

public class DemoThread implements Runnable{
	public void run() {
		synchronized (DemoThread.class) {
			try {
				
				System.out.println("thread is waiting");
				DemoThread.class.wait(2000);
				System.out.println("thread is started");
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		DemoThread dt=new DemoThread();
		Thread t=new Thread(dt);
		t.start();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		synchronized (t) {
			t.notify();
		}
		System.out.println("hello");
	}

}
