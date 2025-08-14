package pkgday8_task;

import java.util.Scanner;

class PalindromeNum {
	public void implPalindromeNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		String reversed = new StringBuilder(input).reverse().toString();
		if (input.equalsIgnoreCase(reversed)) {
			System.out.println("It's a palindrome.");
		} else {
			System.out.println("Not a palindrome.");
		}
	}
}

class Palindrome {
	public static void main(String[] args) {

		PalindromeNum obj = new PalindromeNum();
		obj.implPalindromeNum();

	}

}
