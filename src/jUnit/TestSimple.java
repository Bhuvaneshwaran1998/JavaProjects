package jUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class Simple{
	public int add(int a,int b) {
		return a/b;
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
}

public class TestSimple {
	Simple s=new Simple();
	
	@Before
	public void print() {
		System.out.println("welcome jUnit");
	}
	
	@Test
	public void testAdd() {
		System.out.println(s.add(5, 0));
	}
	
	@Test
	public void testSub() {
		s.sub(3, 7);
	}
	
	@After
	public void print1() {
		System.out.println("End of the program");
	}

}
