package NumberProblems;

import java.util.Scanner;

public class PrimeNumberLimit {

   
    boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }
        return true; // Number is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number:");
        int start = sc.nextInt();
        System.out.println("Enter ending number:");
        int end = sc.nextInt();
        sc.close();

        PrimeNumberLimit p = new PrimeNumberLimit();
        System.out.println("The prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) { // Include 'end' in the range
            if (p.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
