import java.util.Scanner;

public class Pallindrome {

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
        }if(Duplicate==ReverseNumber) {
        	System.out.println(Duplicate+" is a pallindrome number");
        }else {
        	System.out.println(Duplicate+" is not a pallindrome number");
        }
	}

}
