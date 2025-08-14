package pkgday8_task;

import java.util.Scanner;

class PrimeCheck {
	public void ImplPrimeCheck(int num) {
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;

		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(num + " is a Prime Number.");
		} else {
			System.out.println(num + " is not a Prime Number.");
		}
	}
}

public class PrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		PrimeCheck obj = new PrimeCheck();
		obj.ImplPrimeCheck(number);

	}

}
