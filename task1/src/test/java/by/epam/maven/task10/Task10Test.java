package by.epam.maven.task10;

import org.junit.Test;

import by.epam.maven.task9.Task9;
import junit.framework.Assert;

public class Task10Test {
	
	@Test
	public void testF01() {
		int i = 5;
		double expected = -3.380515006246586;
		
		double actual = Task10.f(i);
		Assert.assertEquals(expected, actual);
	}
}