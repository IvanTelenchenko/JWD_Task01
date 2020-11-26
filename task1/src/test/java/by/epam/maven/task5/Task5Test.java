package by.epam.maven.task5;

import org.junit.Test;

import junit.framework.Assert;

public class Task5Test {

	@Test
	public void testSumOfDivisorsOfNum01() {
		
		int i = 10;
		int expected = 8;
		
		int actual = Task5.sumOfDivisorsOfNumber(i);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPerfetNum() {
		
		int i = 6;
		boolean expected = true;
		
		boolean actual = Task5.isPerfectNumber(i);
		Assert.assertEquals(expected, actual);
	}
}