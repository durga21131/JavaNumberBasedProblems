package NumberProblems;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Number");
		// taking input as String
		String StrBinary=sc.next();
		int DecimalValue=0;
		// Convert StrBinary to Decimal value
		for(int i=0;i<StrBinary.length();i++) {
			char bit=StrBinary.charAt(StrBinary.length()-1-i); // accessing rightmost element 
			if(bit=='1') {
				DecimalValue+=Math.pow(2,i);
			}
			else if(bit!='0') {
				System.out.println("Invalid Number");
				return;
			}
		}System.out.println("The Binary decimal form of "+ StrBinary + " is "+DecimalValue);
	}

}
