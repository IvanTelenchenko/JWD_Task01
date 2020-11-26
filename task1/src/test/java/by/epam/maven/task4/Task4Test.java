package by.epam.maven.task4;

import org.junit.Test;

import junit.framework.Assert;

public class Task4Test {
	
	@Test
	public void testIsEvenNumber01() {
		
		int i = 0;
		boolean expected = true;
		
		boolean actual = Task4.isEvenNumber(i);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsMoreThanOneEvenNumber02() {
		
		int a = 1;
		int b = 2;
		int c = 6;
		int d = 4;
		
		boolean expected = true;
		
		boolean actual = Task4.isMoreThanOneEvenNumber(a, b, c, d);
		Assert.assertEquals(expected, actual);
	}
}