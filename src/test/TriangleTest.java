package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import basic.Triangle;

public class TriangleTest {

	Triangle triangle;

	@Before
	public void setUp() throws Exception {
		triangle = new Triangle();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIllegal() {
		
		triangle.setSides( new double[]{2, 4, 8} );
		String result1 = triangle.getType();
		Assert.assertEquals("ILLEGAL", result1);
		
		
		triangle.setSides( new double[]{4, 8, 2} );
		String result2 = triangle.getType();
		Assert.assertEquals("ILLEGAL", result2);
		
		triangle.setSides( new double[]{8, 2, 4} );
		String result3 = triangle.getType();
		Assert.assertEquals("ILLEGAL", result3);
	}
	
	
	@Test
	public void testEQUILATERAL() {
		
		triangle.setSides( new double[]{8, 8, 8} );
		String result1 = triangle.getType();
		Assert.assertEquals("EQUILATERAL", result1);
		
	}
	
	@Test
	public void testISOSCELES() {
		
		triangle.setSides( new double[]{2, 2, 3} );
		String result1 = triangle.getType();
		Assert.assertEquals("ISOSCELES", result1);
		
		
		triangle.setSides( new double[]{2, 3, 2} );
		String result2 = triangle.getType();
		Assert.assertEquals("ISOSCELES", result2);
		
		triangle.setSides( new double[]{3, 2, 2} );
		String result3 = triangle.getType();
		Assert.assertEquals("ISOSCELES", result3);
		
	}
	
	@Test
	public void testSCALENE() {
		
		triangle.setSides( new double[]{23, 25, 32} );
		String result1 = triangle.getType();
		Assert.assertEquals("SCALENE", result1);
		
		
	}

}
