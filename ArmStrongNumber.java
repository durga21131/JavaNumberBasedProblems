package NumberProblems;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
        int Number=sc.nextInt();
        int Duplicate=Number;
        int NumberOfDigits=0;
        int ArmStrong=0;
        int Dup=Number;
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
