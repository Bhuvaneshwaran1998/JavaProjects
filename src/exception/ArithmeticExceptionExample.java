package exception;

public class ArithmeticExceptionExample {
	public static void main(String args[]) {
		try {
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("just run the rest of codes");
		}

		int a = 9;
		System.out.println(a + 1);
	}
}
