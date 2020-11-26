package by.epam.maven.task2;

import org.junit.Test;

import junit.framework.Assert;

public class Task2Test {
	
	@Test
	public void testLeapYear01() {
		int year = 2020;
		boolean expected = true;
		
		boolean actual = Task2.isLeapYear(year);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNumOfDaysInLeapYear02() {
		
		Date date = new Date(2,2008);
		int expected = 29;
		
		int actual = Task2.numberOfDaysInMounth(date);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNumOfDaysInNonLeapYear() {
		
		Date date = new Date(2,1983);
		int expected = 28;
		
		int actual = Task2.numberOfDaysInMounth(date);
		Assert.assertEquals(expected, actual);
	}
}