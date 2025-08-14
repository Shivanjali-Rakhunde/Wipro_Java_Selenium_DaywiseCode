package pkg_day6;

public class NestedTry {

	public static void main(String[] args) {
		int[] number = {100, 20};
		
		try {
			System.out.println("Outer's try block");
			try {
				int result = number[0]/number[1];
				System.out.println("Inner's try block:" + result);
			}catch(ArithmeticException e) {
				System.out.println("Inner's try catch: Divide by zero");
			}
			
			int value = number[2];
			System.out.println("Value:" + value);
		}
		    catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
		    	System.out.println("Outer catch block");
				
			} finally {
				System.out.println("Example of outer/Inner try block");
			}
		}

	}


