package pkg_day6;

import java.util.Scanner;

public class ExceptionHandlingArithmetic {
    public static void main(String[] args) {
    	int num, den, result;
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the numerator:");
    	
    	num = sc.nextInt();
    	
    	System.out.println("Enter the denominator:");
    	den = sc.nextInt();
    	
    	// Try block may be followed either by CATCH block or FINALLY block
    	
    	try {
    		int[] arr = new int[4];
    	arr[5]=343;
    	result = num/den;
    	System.out.println("Result is: "+result);

    	}catch(ArithmeticException e) {
    	       System.out.println("Cannot divide the numerator by zero");
               e.printStackTrace();
    }catch(ArrayIndexOutOfBoundsException ae) {
        System.out.println("Index not Valid");
    }finally{
    	result = num/30;
    	System.out.println("Result is:"+ result);
    	System.out.println("Finally block will always be executed no matter exception occurs or not");
    }

    }
}
