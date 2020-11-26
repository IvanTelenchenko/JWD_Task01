package by.epam.maven.task3;

import org.junit.Test;

import junit.framework.Assert;

public class Task3Test {
	
	@Test
	public void testSideOfSquare01() {
		
		double s = 25;
		double expected = 5;
		
		double actual = Task3.sideOfSquare(s);
		Assert.assertEquals(expected, actual, 0.00001);
	}
	
	@Test
	public void testSideOfNewSquare02() {
		
		double d = 10;
		double expected = 7.0710678;
		
		double actual = Task3.sideOfNewSquare(d);
		Assert.assertEquals(expected, actual, 0.0000001);
	}
	
	@Test
	public void testAreaOfSquare03() {
		
		double d = 20;
		double expected = 200;
		
		double actual = Task3.areaOfNewSquare(d);
		Assert.assertEquals(expected, actual, 0.0000001);
	}
}