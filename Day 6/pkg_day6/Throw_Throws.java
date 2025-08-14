package pkg_day6;

public class Throw_Throws {
	
	public static void checkAge(int age) {
		if(age < 18) {
			throw new IllegalArgumentException("Access Denied... Your age must have atleast 18 years old");
		}else {
			System.out.println("Access granted - You are eligible to vote.");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(16);
		}catch(IllegalArgumentException e) {
			System.out.println("Exception Caught:"+ e.getMessage());
		}
		
		System.out.println("Program Continues...");
		

	}

}
