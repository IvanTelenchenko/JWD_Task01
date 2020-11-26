package by.epam.maven.task6;

/*6.	Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.*/

public class Task6 {
	public static void main(String args[]) {
		
		int sec = 36353;
		time(sec);
	}
	
	public static void time(int sec) {
		
		if(sec >= 0) {
			System.out.printf("%2d : %2d : %2d",findHourInDay(sec),findMinute(sec),findSecond(sec));
		}else
			System.out.println("Time can't be negative");
	}
	
	public static int findTotalHour(int sec) {
		if(sec < 0) {
			return 0;
		}
		return sec/3600;
	}
	
	public static int findHourInDay(int sec) {
		if(sec < 0) {
			return 0;
		}
		return findTotalHour(sec)%24;
	}
	
	public static int findMinute(int sec) {
		if(sec < 0) {
			return 0;
		}
		return (sec-findTotalHour(sec)*3600)/60;
	}
	
	public static int findSecond(int sec) {
		if(sec < 0) {
			return 0;
		}
		return sec-findTotalHour(sec)*3600 - findMinute(sec)*60;
	}
}