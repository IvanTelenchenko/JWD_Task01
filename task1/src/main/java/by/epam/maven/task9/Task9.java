package by.epam.maven.task9;

/*9.	Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.*/

public class Task9 {

	public static void main(String[] args) {
		
		double r = 5;
		System.out.println(lengthCircle(r));
		System.out.println(squareCircle(r));
	}
	
	public static double lengthCircle(double r) {
		if(r > 0) {
			return 2*Math.PI*r;
		} else 
			System.out.println("Error. Please check your value. This must be a positive number");
			return 0;
	}
	
	public static double squareCircle(double r) {
		if(r > 0) {
			return Math.PI*Math.pow(r, 2);
		} else 
			System.out.println("Error. Please check your value. This must be a positive number");
			return 0;
	}
}