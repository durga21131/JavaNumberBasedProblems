package NumberProblems;

import java.util.Scanner;

public class ArmStrongNumber {
    /* 
        An Armstrong number (also known as a narcissistic number, pluperfect digital invariant, or PPDI) 
        is a number that is equal to the sum of its digits each raised to the power of the number of digits.
        Steps to Check an Armstrong Number:
              1. Count the number of digits d.
              2. Separate the digits of the number.
              3. Raise each digit to the power d and compute the sum.
              4. Check if the sum equals the original number.
        Example:
        153 = 1*1*1+5*5*5+3*3*3 = 1+125+27 =153
        here number of digits is 3 (1,5,3) and individual digits are 1,5,3.
    */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
        int Number=sc.nextInt();
        int Duplicate=Number;
        int NumberOfDigits=0;
        int ArmStrong=0;
        int Dup=Number;
        // int digits = String.valueOf(number).length(); // Count number of digits
        while(Number>0) {
        	NumberOfDigits++;
        	Number/=10;
        }
        while(Duplicate>0) {
        	int Remainder=Duplicate%10;
        	ArmStrong+=Math.pow(Remainder,NumberOfDigits);
        	Duplicate/=10;
        }
        if(ArmStrong==Dup) {
        	System.out.println(Dup+ " is a Armstrong number");
        }else {
        	System.out.println(Dup+ " is not a Armstrong number");
        }
	}

}
