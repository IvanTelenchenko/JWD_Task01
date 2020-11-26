package by.epam.maven.task7;

import org.junit.Test;

import junit.framework.Assert;


public class Task7Test {

	@Test
	public void testFindLength() {
		
		Point p = new Point(0,9);
		double expected = 9;
		
		double actual = Task7.findLength(p);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCompareLengthsOfTwoPoints02() {
		
		Point p1 = new Point(-8,15);
		Point p2 = new Point(-5,5);
		double expected = 7.0710678;
		
		double actual = Task7.compareLengthsOfTwoPoints(p1, p2);
		Assert.assertEquals(expected, actual,0.0000001);
	}
}