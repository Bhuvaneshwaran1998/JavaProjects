package jUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAssertClassMethods {
	
	
	// it will check the Equals value
	@Test
	public void testAssertEqual() {
		assertEquals(3, 3);
		
	}
	
	//
	@Test
	public void testAssertNotEqual() {
		assertNotEquals(3, 4);
	}
	
	@Test
	public void testAssertNull() {
		assertNull(null);
		//assertNull("bhuvi");
	}
	
	@Test
	public void testAssertNotNull() {
		assertNotNull(getClass());
		//assertNotNull(Emplyee));
	}
	
	@Test
	public void testAssertTrue() {
		boolean a=10>9;
		assertTrue(a);
	}
	
	@Test
	public void testAssertFalse() {
		boolean b=10>11;
		assertFalse(b);
	}
	
	@Test
	public void testAssertSame() {
		int a=10;
		int b=10;
		assertSame(a, b);
	}
	
	@Test
	public void testAssertNotSame() {
		int a=10;
		int b=11;
		assertNotSame(a, b);
	}
	
	@Test
	public void testAssertArrayEqual() {
		int[] a= {1,2,3};
		int[] b= {1,2,3};
		assertArrayEquals(a, b);
	}
	
	

}
