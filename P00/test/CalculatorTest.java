import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddPositive() {
		//fail("Not yet implemented");
		int a = 8765;
		int b = 1234;
		
		Calculator cal = new Calculator();
		
		int actual = cal.add(a, b);
		
		int expected = 9999;
		
		assertEquals(expected , actual);
	}
	
	@Test
	public void testAddNegative() {
		//fail("Not yet implemented");
		int a = -8765;
		int b = -1234;
		
		Calculator cal = new Calculator();
		
		int actual = cal.add(a, b);
		
		int expected = -9999;
		
		assertEquals(expected , actual);
	}
	
	@Test
	public void testsubtract() {
		//fail("Not yet implemented");
		int a = 100;
		int b =  50;
		
		Calculator cal = new Calculator();
		
		int actual = cal.subtract(a, b);
		
		int expected = 50;
		
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 2;
		int b = 5;
		
		Calculator cal = new Calculator();
		
		int actual = cal.multiply(a, b);
		
		int expected = 10;
		
		assertEquals(expected , actual);
	}
	
	
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 10;
		int b = 0;
		
		Calculator cal = new Calculator();
		
		int actual = cal.divide(a, b);
		
		int expected = 0;
		
		assertEquals(expected , actual);
	}
	

}
