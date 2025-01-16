package NumberProblems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long Number = sc.nextLong();
		long Duplicate = Number;
		int SOD = 0;
		//checking number of digits
		while (Number > 0) {
			long remainder = Number % 10;
			SOD += remainder;
			Number /= 10;
		}
		System.out.println("The sum of individual digits of "+Duplicate+" is: "+SOD);

	}

}
