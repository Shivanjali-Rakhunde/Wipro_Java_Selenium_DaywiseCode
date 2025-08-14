package pkgday8_task;

import java.util.Scanner;

class FactorialNum {
	public void ImplFactorialNum(int num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial: " + fact);
	}
}

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		FactorialNum obj = new FactorialNum();
		obj.ImplFactorialNum(number);

	}

}

