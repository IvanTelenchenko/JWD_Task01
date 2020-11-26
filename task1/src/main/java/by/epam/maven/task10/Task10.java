package by.epam.maven.task10;

/*10.	Составить программу для вычисления значений функции F(x)
 *  на отрезке [а, b] с шагом h. Результат представить в виде таблицы,
 *   первый столбец которой – значения аргумента, второй - соответствующие 
 *   значения функции.*/

public class Task10 {
	public static void main(String args[]) {
		
		double a = 5;
		double b = 10;
		double h = 0.5;
		
		cycle(a,b,h);
	}
	
	public static double f(double x) {
		return Math.tan(x);
	}
	
	public static void cycle(double a, double b, double h) {
		for(; a <= b; a += h) {
			print(a, f(a));
		}
	}
	
	public static void print(double a, double f) {
		System.out.printf("%-6.3f%1s%7.4f\n",a,"|",f);
	}
}