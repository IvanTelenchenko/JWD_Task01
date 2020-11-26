package by.epam.maven.task1;

/*1.	Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.*/

public class Task1 {
	public static void main (String args[]) {
		int i = 23412;
		System.out.println(lastDigit(i));
		System.out.println(lastDigitOfSquareOfNumber(lastDigit(i)));
	}
	
	public static int lastDigit(int x) {
		int result = x;
		if(result > 10) {
			result = remainderOfDivisionByTen(result);
		}
		return result;
	}
	
	public static int remainderOfDivisionByTen(int x) {
		int result = x;
		return result %= 10;
	}
	
	public static int lastDigitOfSquareOfNumber(int x) {
		return lastDigit((int)Math.pow(x,2));		
	}
}