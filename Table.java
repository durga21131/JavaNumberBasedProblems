package NumberProblems;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for a table");
		int table = sc.nextInt();
		System.out.println("please give start and stop values");
		int start = sc.nextInt();
		int stop = sc.nextInt();
		for(int i=start ; i <= stop;i++) {
			System.out.println(table +" * "+i+" = "+ table*i);
		}
		sc.close();
	}

}
