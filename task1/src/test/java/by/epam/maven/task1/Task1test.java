package by.epam.maven.task1;

import org.junit.Test;

import junit.framework.Assert;

public class Task1test {
	
	@Test
	public void testSquareOfNumber01() {
		
		int i = 3;
		int expected = 9;
		
		int actual = Task1.lastDigitOfSquareOfNumber(i);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testRemainderOfDivisionByTen02() {
		
		int i = 103;
		int expected = 3;
		
		int actual = Task1.lastDigit(i);
		Assert.assertEquals(expected, actual);
	}
}