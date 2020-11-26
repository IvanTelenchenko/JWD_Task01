package by.epam.maven.task8;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(value = Parameterized.class)
public class Task8Test {
	
	private double x;
	private double expected;
	
	@Parameters
	public static Collection<Object[]> tableValue(){
		return Arrays.asList(new Object[][]{
			{2,0.5},
			{3,9.0},
			{4,5.0},
			{5,-1.0}
		});
	}
	
	public Task8Test(double x, double expected) {
		this.x = x;
		this.expected = expected;
	}
	
	@Test
	public void testF01() {
		double actual = Task8.f(x);
		Assert.assertEquals(expected, actual);
	}
}