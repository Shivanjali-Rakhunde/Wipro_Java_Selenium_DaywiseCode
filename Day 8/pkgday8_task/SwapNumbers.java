package pkgday8_task;

class SwapNumbersWithoutThird {
	public void swap(int a, int b) {
		System.out.println("Before Swap: a= " + a + ", b= " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Awap: a= " + a + ",b= " + b);
	}
}

public class SwapNumbers {

	public static void main(String[] args) {
		SwapNumbersWithoutThird obj = new SwapNumbersWithoutThird();
		obj.swap(10, 20);
	}

}
