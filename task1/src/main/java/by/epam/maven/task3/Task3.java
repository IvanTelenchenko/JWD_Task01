package by.epam.maven.task3;

/*3.Окружность вписана в квадрат заданной площади. 
 * Найти площадь квадрата, вписанного в эту окружность.
 * Во сколько раз площадь вписанного квадрата меньше площади заданного?*/

public class Task3 {
	public static void main(String args[]) {
		
		double areaOfSquare = 126.458;
		
		double newAreaOfSquare = areaOfNewSquare(sideOfSquare(areaOfSquare));
		
		System.out.println("The area of a square inscribed in a circle is "
				+ areaOfSquare/newAreaOfSquare + " \ntimes smaller than the area of a "
						+ "square described around the circle.");
	}
	
	public static double sideOfSquare(double square) {		
		return Math.sqrt(square);
	}
	
	public static double areaOfNewSquare(double side) {
		return Math.pow(sideOfNewSquare(side), 2);
	}
	
	public static double sideOfNewSquare(double side) {
		return side/(Math.sqrt(2));
	}
}