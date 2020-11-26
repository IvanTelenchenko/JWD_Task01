package by.epam.maven.task8;

/*8.	Вычислить значение функции:
 * (x >= 3) -Math.pow(x,2) + 3*x + 9;
	(x < 3)	 1/(Math.pow(x, 3) - 6);
*/	 


public class Task8 {
	public static void main(String args[]) {
		double x = 4;
		System.out.println(f(x));
	}
	
	public static double f(double x) {
		
		double result = 0;
		
		if(x >= 3) {
			result = -Math.pow(x,2) + 3*x + 9;
		} else {
			result = 1/(Math.pow(x, 3) - 6);
		}
		return result;
	}
}