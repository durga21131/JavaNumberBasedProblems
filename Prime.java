import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
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