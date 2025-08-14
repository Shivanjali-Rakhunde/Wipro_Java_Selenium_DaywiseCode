package pkgday8_task;

import java.util.Scanner;

class GreatestOfTenNum {
	public void findGreatest(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Greatest number: " + max);
	}
}

public class GreatestOfTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];

		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			nums[i] = sc.nextInt();
		}

		GreatestOfTenNum obj = new GreatestOfTenNum();
		obj.findGreatest(nums);

	}
}
