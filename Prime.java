import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		/* A prime number is a natural number greater than 1 that has no divisors other than 1 and itself.
		 In other words, a prime number can only be divided evenly by 1 and itself. */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a prime or not");
		int input = sc.nextInt();
		// there is many ways to solve the solution u want choose best one w.r.t time
		// and space complexities.
		int FactorCount = 0;
		for (int i = 2; i <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				FactorCount++;
				break;
			}
		}
		if (FactorCount >= 1) {
			System.out.println(input + " is not a prime number");
		} else {
			System.out.println(input + " is a prime number");
		}
	}

}