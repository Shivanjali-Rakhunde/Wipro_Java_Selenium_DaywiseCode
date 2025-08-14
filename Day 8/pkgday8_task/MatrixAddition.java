package pkgday8_task;

import java.util.Scanner;

class MatrixAdditionNum {
	public void addMatrics(int[][] a, int[][] b) {
		int[][] sum = new int[2][3];

		System.out.println("Resultant Matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.println(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][3];
		int[][] b = new int[2][3];

		System.out.println("Enter first 2x3 matrix:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter second 2x3 matrix:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		MatrixAdditionNum obj = new MatrixAdditionNum();
		obj.addMatrics(a, b);

	}

}
