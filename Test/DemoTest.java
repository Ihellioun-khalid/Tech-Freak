import static org.junit.Assert.*;

import org.junit.Test;

import com.string.Demo;

public class DemoTest {

	@Test
	public void testcompareStringIgnoreCase() {
		Demo demo =new Demo();
		String a = "test";
		String b = "Test";
		assertTrue(demo.compareStringIgnoreCase(a, b));
		assertTrue(a+" est "+b+"ne sont pas egaux",demo.compareStringIgnoreCase(a,b));
		assertFalse(!demo.compareStringIgnoreCase(a, b));
		assertFalse(a+" est "+b+" sont pas egaux",!demo.compareStringIgnoreCase(a,b));
	}
	@Test
	public void testconcatString() {
		Demo demo =new Demo();
		String a = "Hello ";
		String b = "world";
		String c ="Hello world";
		assertEquals(c, demo.concatString(a,b));
	}
	@Test
	public void testaddOneToArray() {
		Demo demo =new Demo();
		int[]a=new int[] {3,8};
		int[]b=new int[] {2,7};
		assertArrayEquals(a, demo.addOneToArray(b));
	}
	@Test(timeout =10)
	public void testperformance() {
		Demo demo =new Demo();
		 demo.performance();
	}
}
