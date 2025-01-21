package NumberProblems;

import java.util.Scanner;

public class HarshadNumber {
	/*
	   A Harshad number (also known as a Niven number) is a positive integer that is divisible by the sum of its digits. 
	   The term "Harshad" comes from the Sanskrit words "har" (meaning "joy") and "shad" (meaning "give"), collectively meaning "joy-giver." 
	     Examples:
            18: The sum of its digits is 1 + 8 = 9, and 18 is divisible by 9.
			1729: The sum of its digits is 1 + 7 + 2 + 9 = 19, and 1729 is divisible by 19.
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check it is Harshad number or not");
		int Number = sc.nextInt();
		int Duplicate = Number;
		int SOD = 0;
		while(Number > 0) {
			int remainder = Number%10;
			SOD += remainder;
			Number /= 10;
		}
		
		sc.close();
	}

}
