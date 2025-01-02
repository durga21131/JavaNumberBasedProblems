package NumberProblems;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check it is Harshad number or not");
		int Number=sc.nextInt();
		int Duplicate=Number;
		int SOD=0;
		while(Number>0) {
			int remainder=Number%10;
			SOD+=remainder;
			Number/=10;
		}if(Duplicate%SOD==0) {
			System.out.println(Duplicate+" is a Harshad Number");
		}else {
			System.out.println(Duplicate+" is not Harshad Number");
		}
	}

}
