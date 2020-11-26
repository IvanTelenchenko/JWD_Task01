package by.epam.maven.task5;

/*5.	Составить программу, печатающую значение true, если указанное высказывание является истинным,
 *  и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).*/

public class Task5 {
	public static void main (String args[]) {
		
		int i = 28;
		
		System.out.println(isPerfectNumber(i));
	}
	
	public static boolean isPerfectNumber(int i) {
		
		if(i > 0 && i == sumOfDivisorsOfNumber(i)) {
			return true;
		}else
			return false;
	}
	
	public static int sumOfDivisorsOfNumber(int i) {
		int result = 1;
		for(int j = 2; j <= i/2; j++) {
			if(i%j == 0) {
				result += j;
			}
		}
		return result;
	}
}