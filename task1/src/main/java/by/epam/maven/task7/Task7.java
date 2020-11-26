package by.epam.maven.task7;

/*7.	Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
 *  которая из точек находится ближе к началу координат. x y.*/

public class Task7 {

	public static void main(String[] args) {
		
		Point p1 = new Point(11,10);
		Point p2 = new Point(-12,10);
		
		System.out.println(compareLengthsOfTwoPoints(p1, p2));
	}
	
	public static double findLength(Point p) {
		double result;
		result = Math.sqrt(Math.pow(p.getX(), 2)+Math.pow(p.getY(), 2));
		return result;
	}
	
	public static double compareLengthsOfTwoPoints(Point p1, Point p2) {
		double result = findLength(p1);
		
		if(findLength(p1) > findLength(p2)) {
			System.out.println("The point 2 is closer");
			result = findLength(p2);
		}else if(findLength(p1) == findLength(p2)) {
			System.out.println("The points are located at the same length ");
		}else
			System.out.println("The point 1 is closer");
		return result;
	}
}