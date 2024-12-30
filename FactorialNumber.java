package NumberProblems;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        int Factorial=1;
        if(Number<0) {
        	System.out.println("Factorial for negative numbers are undefined");
        }
        else if(Number==0) {
        	System.out.println(" Factorial for 0 is: 1");
        }else {
        	for(int i=1;i<=Number;i++) {
        		Factorial*=i;
        	}
        	System.out.println("Factorial of "+Number+" is: "+Factorial );
        }
	}

}
