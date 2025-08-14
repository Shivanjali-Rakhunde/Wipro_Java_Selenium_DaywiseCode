package Task.java;

public class TaskSolution {

	// 1. Reverse tables from 10 to 1
	public String printReverseTable(int num) {
        String result = "";
        for (int i = 10; i >= 1; i--) {
            result += num + " x " + i + " = " + (num * i);
            if (i != 1) {
                result += "\n";  
            }
        }
        return result;
    }

	// 2. Print all alphabets from a to z
	public String printAlphabets() {
		String result = "";
		for (char c = 'a'; c <= 'z'; c++) {
			result += c;
		}
		return result;
	}

	// 3. ASCII values of all characters
	public String[] printASCIIValues() {
		String[] ascii = new String[128]; 
		for (int i = 0; i < 128; i++) {
			ascii[i] = (char) i + " = " + i;
		}
		return ascii;
	}

	// 4. Factorial of a number
	public int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	// 5. Count positive, negative, zero numbers
	public int[] countPosNegZero() {
		int[] arr = { 1, -2, 0, 4, -5, 0, 6 }; // sample data
		int pos = 0, neg = 0, zero = 0;

		for (int num : arr) {
			if (num > 0)
				pos++;
			else if (num < 0)
				neg++;
			else
				zero++;
		}
		return new int[] { pos, neg, zero };
	}

	// 6. Find largest and smallest
	public int[] findLargestSmallest() {
		int[] arr = { 10, -4, 23, 0, 17, -100, 85 };
		int largest = arr[0];
		int smallest = arr[0];

		for (int num : arr) {
			if (num > largest)
				largest = num;
			if (num < smallest)
				smallest = num;
		}
		return new int[] { largest, smallest };
	}

	// 7. Numbers divisible by 9 between 100 and 200
	public int[] divisibleBy9() {
		int count = 0, sum = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 9 == 0) {
				count++;
				sum += i;
			}
		}
		return new int[] { count, sum };
	}

	// 8. 1's complement
	public int onesComplement(int num) {
		return ~num;
	}

	// 9. 2's complement
	public int twosComplement(int num) {
		return ~num + 1;
	}

	// 10. Fibonacci series
	public int[] fibonacci(int n) {
		int[] fib = new int[n];
		if (n > 0)
			fib[0] = 0;
		if (n > 1)
			fib[1] = 1;

		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib;

	}

}
