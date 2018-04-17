import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.string.Demo;

class DemoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testcompareStringIgnoreCase() {
		Demo demo =new Demo();
		String a = "test";
		String b = "Test";
		assertTrue(demo.compareStringIgnoreCase(a, b));
		assertTrue(a+" est "+b+"ne sont pas egaux",demo.compareStringIgnoreCase(a,b));
		assertFalse(!demo.compareStringIgnoreCase(a, b));
		assertFalse(a+" est "+b+" sont pas egaux",!demo.compareStringIgnoreCase(a,b));
	}
	@Test
	void testconcatString() {
		Demo demo =new Demo();
		String a = "Hello ";
		String b = "world";
		String c ="Hello world";
		assertEquals(c, demo.concatString(a,b));
	}
	@Test
	void testaddOneToArray() {
		Demo demo =new Demo();
		int[]a=new int[] {3,8};
		int[]b=new int[] {2,7};
		assertArrayEquals(a, demo.addOneToArray(b));
	}
}
