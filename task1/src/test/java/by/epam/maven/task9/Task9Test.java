package by.epam.maven.task9;

import org.junit.Test;

import by.epam.maven.task8.Task8;
import junit.framework.Assert;

public class Task9Test {
	
	@Test
	public void testLengthCircle01() {
		double r = 5;
		double expected = 31.41592653589793;
		
		double actual = Task9.lengthCircle(r);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSquareCircle02() {
		double r = 5;
		double expected = 78.53981633974483;
		
		double actual = Task9.squareCircle(r);
		Assert.assertEquals(expected, actual);
	}
}