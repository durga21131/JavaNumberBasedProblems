import java.util.Scanner;

public class Pallindrome {
	/* 
	    A palindrome number is a number that reads the same backward as it does forward. 
	    In other words, its digits are symmetric.
	    Examples:
            Palindrome Numbers: 121, 1331, 12321, 44, 7.
            Not Palindrome Numbers: 123, 10, 1234.
	*/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a pallindrome or not");
        int Number=sc.nextInt();
        int Duplicate=Number;
        int ReverseNumber=0;
        while(Number>0) {
        	int remainder=Number%10;
        	ReverseNumber=ReverseNumber*10+remainder;
        	Number/=10;
		// checking pallindrome or not
        
	}

}
