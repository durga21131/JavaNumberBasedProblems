package NumberProblems;

import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		Swapping s = new Swapping();
		// s.WithOutUsing3Variable();
		// s.WithOutUsing3Variable2();

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Value");
		int a = sc.nextInt();
		System.out.println("Eneter second value ");
		int b = sc.nextInt();
		System.out.println("the values before swapping is:");
		System.out.println("a value is: " + a + "   b value is " + b);
		int c = a;
		a = b;
		b = a;
		System.out.println("Values after swapping is:");
		System.out.println("a value is: " + b + "   b value is " + a);

	}

	void WithOutUsing3Variable() {
		int a = 10;
		int b = 15;
		System.out.println("the values before swapping is:");
		System.out.println("a value is: " + a + "    b value is " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("the values after swapping is:");
		System.out.println("a value is: " + a + "   b value is " + b);
	}


	void WithOutUsing3Variable2() {
		int a = 10;
		int b = 15;
		System.out.println("the values before swapping is:");
		System.out.println("a value is: " + a + "   b value is " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("the values after swapping is:");
		System.out.println("a value is: " + a + "   b value is " + b);
	}

	sc.close();
}
