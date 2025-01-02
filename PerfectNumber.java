package NumberProblems;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check it is Perfect number or not");
		int Number=sc.nextInt();
		int Sum=0;
		for(int i=1;i<Number;i++) {
			if(Number%i==0) {
				Sum+=i;
			}
		}if(Sum==Number) {
			System.out.println(Number+" is a perfect Number");
		}else {
			System.out.println(Number+ " is not a perfect Number");
		}

	}

}
