package NumberProblems;

import java.util.Scanner;

public class PerfectSquare {
	/* 
	 * A perfect square number is a number that is the square of an integer. 
	 * In other words, if a number n can be expressed as n=k*k(k square)
	 * where k is an integer, then n is a perfect square.
	 * Perfect square numbers are always non-negative because squaring any
	 * integer (positive or negative) results in a non-negative value.
	 * Sum of Consecutive Odd Numbers: Any perfect square is equal to the sum of 
	 * the first n consecutive odd numbers. For example:
	 * 1=1
	 * 4=1+3
	 * 9=1+3+5
	 * 16=1+3+5+7
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Number=sc.nextInt();
		int OddSum=0;
		int Square=0;
		if(Number<0) {
			System.out.println( "Perfect square is not possible for negative numbers");
		}
		else {
		   for(int i = 1; i < Number; i++) {
			   if ( i%2 == 1){
				  OddSum += i;
				  Square++;
				  if(OddSum==Number) {
					 break;
				}
			}
		  }
		if(Number==OddSum) {
			System.out.println(Number+" is a perfect square number of: "+Square);
		}
		else {
			System.out.println(Number+" is not a perfect square number");
		}
	}
	}
}
