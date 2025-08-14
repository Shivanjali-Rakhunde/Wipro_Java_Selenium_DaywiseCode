package Task.java;

public class Main {
	public static void main(String[] args) {
		TaskSolution ts = new TaskSolution();

		// 1
		System.out.println(ts.printReverseTable(7));

		// 2
		System.out.println("Alphabets: " + ts.printAlphabets());

		// 3
		String[] ascii = ts.printASCIIValues();
		System.out.println("ASCII of A: " + ascii[65]);

		// 4
		System.out.println("Factorial of 5: " + ts.factorial(5));

		// 5
		int[] count = ts.countPosNegZero();
		System.out.println("Positives: " + count[0] + ", Negatives: " + count[1] + ", Zeros: " + count[2]);

		// 6
		int[] maxMin = ts.findLargestSmallest();
		System.out.println("Largest: " + maxMin[0] + ", Smallest: " + maxMin[1]);

		// 7
		int[] div9 = ts.divisibleBy9();
		System.out.println("Count divisible by 9: " + div9[0] + ", Sum: " + div9[1]);

		// 8
		System.out.println("1's Complement of 2: " + ts.onesComplement(2));

		// 9
		System.out.println("2's Complement of 2: " + ts.twosComplement(2));

		// 10
		int[] fib = ts.fibonacci(10);
		System.out.print("Fibonacci(10): ");
		for (int i : fib)
			System.out.print(i + " ");
	}
}
