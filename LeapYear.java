import java.util.Scanner;

public class LeapYear {
	/*
	 A leap year is a year that contains one additional day to keep the calendar year synchronized with the
		 astronomical year or seasonal year. Instead of the usual 365 days, a leap year has 366 days, 
		 with February 29 as the extra day.
         Rules to Determine a Leap Year:
           1. Divisible by 4: A year is a leap year if it is divisible by 4.
           2. Not divisible by 100: However, if the year is divisible by 100, it is not a leap year unless...
           3. Divisible by 400: If the year is divisible by 400, it is a leap year.
		    a century year is also a leap if it is divisible by 400
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a leap year or not");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is a leap year");
		} else if (year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}
