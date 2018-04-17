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
	void test() {
		Demo demo =new Demo();
//		assertTrue(demo.compareStringIgnoreCase("hello", "Hello"));
		assertTrue("hello and Helo not failed",demo.compareStringIgnoreCase("hello", "Hello"));
	}

}
