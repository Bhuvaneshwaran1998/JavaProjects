package jUnit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class Demo{
	public String reverce(String a) {
		String b="";
		for(int i=a.length()-1; i>=0; i--) {
			b=b+a.charAt(i);
		}
		return b;
	}
}


public class OwnTestCase {
	Demo d=new Demo();
	
	@Before
	public void print() {
		System.out.println("welcome to owm test case");
	}
	
	@Test
	public void testReverce() {
		assertEquals(d.reverce("dog"), "god");
	}
	
	@After
	public void print1() {
		System.out.println("end this code");
	}

}
