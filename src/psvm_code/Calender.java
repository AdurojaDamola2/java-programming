package psvm_code;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calender {
	public static String findDay(int month, int day, int year){
		LocalDate localDate = LocalDate.of (year, month, day);
		DayOfWeek dayOfWeek = localDate.getDayOfWeek ();
		return  dayOfWeek.toString ();
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		int month = scanner.nextInt ();
		int day = scanner.nextInt ();
		int year = scanner.nextInt ();
		String dayOfWeek = findDay (month, day, year);
		System.out.println (dayOfWeek);
		scanner.close ();
	}
}
