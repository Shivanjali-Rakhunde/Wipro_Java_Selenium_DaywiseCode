package pkgday8_task;

import java.util.Scanner;

class ReverseArrayNum {
	public void reverse(int[] arr) {
		System.out.println("Reversed Array: ");
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i] + " ");
		}
	}

}

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("Enter 5 elements: ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		ReverseArrayNum obj = new ReverseArrayNum();
		obj.reverse(arr);
	}
}
