package pkg_day6;

public class Throws {
	
	public static void checkAge(int age) throws IllegalArgumentException{
		if (age < 18) {
			throw new IllegalArgumentException("Access Denied.....Your age must have atleast 18 years old");
		}else {
			System.out.println("Access Granted... Your age is eligible for vote");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(21);
		}catch(IllegalArgumentException e) {
			System.out.println("Exception caught:"+ e.getMessage());
		}
		
		System.out.println("Program Continues...");

	}

}
