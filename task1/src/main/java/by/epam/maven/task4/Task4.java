package by.epam.maven.task4;

/*4.Составить программу, печатающую значение true, если указанное высказывание является истинным, 
 * и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.*/

public class Task4 {
	public static void  main(String args[]) {
		
		int a = 2;
		int b = -6;
		int c = 3;
		int d = 1;
		
		System.out.println(isMoreThanOneEvenNumber(a, b, c, d));	
	}

	public static boolean isEvenNumber(int a) {
		
		if(a%2 == 0) {
			return true;
		} else
			return false;
	}
	
	public static boolean isMoreThanOneEvenNumber(int a,int b,int c,int d) {
		
		if(isEvenNumber(a) && (isEvenNumber(b) || isEvenNumber(c) || isEvenNumber(d))){
			return true;
		} else if(isEvenNumber(b) && (isEvenNumber(a) || isEvenNumber(c) || isEvenNumber(d))) {
			return true;
		} else if(isEvenNumber(c) && (isEvenNumber(a) || isEvenNumber(b) || isEvenNumber(d))) {
			return true;
		} else
			return false;
	}
}