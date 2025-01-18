package NumberProblems;

import java.util.Scanner;

public class FactorialNumber {
	/*
	
	The factorial of a non-negative integer n, denoted as 𝑛!, is the product of all positive integers less than or equal to n.
    It is mathematically defined as:
	n!=n*(n-1)*(n-2)*....*2*1

	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int Factorial = 1;
        if(Number < 0) {
        	System.out.println("Factorial for negative numbers are undefined");
        }
        else if(Number == 0) {
        	System.out.println("Factorial for 0 is: 1");
        }
		else {
        	for(int i=1; i<=Number ;i++) {
        		Factorial *= i;
        	}
        	System.out.println("Factorial of "+Number+" is: "+Factorial );
        }
		sc.close();
	}

}
