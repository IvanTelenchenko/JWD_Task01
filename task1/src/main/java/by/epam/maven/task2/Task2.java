package by.epam.maven.task2;

/*2.	Составить программу, которая по заданным году и 
 * номеру месяца определяет количество дней в этом месяце 
 * и корректно определялись все високосные года.*/

public class Task2 {
	public static void main(String args[]) {
		
		Date date = new Date(2,2019);
		
		System.out.println(numberOfDaysInMounth(date));
	}

	public static boolean isLeapYear(int year) {
		
		boolean result = false;
		if(year%4 == 0) {
			result = true;
		}
		return result;
	}
	
	public static int numberOfDaysInMounth(Date date) {
		
		int result = 0;
		int d = date.getYear();
		int mounth = date.getMounth();
		
		if(isLeapYear(d) && mounth == 2) {
			result = 29;
		} else if((mounth < 8 && mounth%2==1) | (mounth > 7 && mounth%2==0)) {
			result = 31;
		} else if((mounth > 8 && mounth%2==1) | (mounth < 7 && mounth%2==0)) {
			if(mounth ==2) {
				result = 28;
			} else
			result = 30;
		}
		return result;
	}
}