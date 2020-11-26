package by.epam.maven.task6;

import org.junit.Test;

import junit.framework.Assert;

public class Task6Test {
	
	@Test
	public void testFindTotalHour01() {
		int sec = 36000;
		int expected = 10;
		
		int actual = Task6.findTotalHour(sec);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindHourInDay02() {
		int sec = 360000;
		int expected = 4;
		
		int actual = Task6.findHourInDay(sec);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindMinute03() {
		int sec = 36353;
		int expected = 5;
		
		int actual = Task6.findMinute(sec);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindSecond04() {
		int sec = 36353;
		int expected = 53;
		
		int actual = Task6.findSecond(sec);
		Assert.assertEquals(expected, actual);
	}
}