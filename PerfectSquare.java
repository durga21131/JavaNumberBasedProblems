package NumberProblems;

import java.util.Scanner;

public class PerfectSquare {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Number=sc.nextInt();
		int OddSum=0;
		int Square=0;
		if(Number<0) {
			System.out.println( "Perfect square is not possible for negative numbers");
		}
		else {
		   for(int i=1;i<Number;i++) {
			   if (i%2==1){
				  OddSum+=i;
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
