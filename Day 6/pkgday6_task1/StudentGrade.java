package pkgday6_task1;

import java.util.*;

class InvalidGradeException extends Exception {

	public InvalidGradeException(String message) {
		super(message);
	}
}

public class StudentGrade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		
		int stuCount = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= stuCount ; i++) {
			System.out.println("\nStudent " + i + ":");

			System.out.println("Enter name: ");
			String name = sc.nextLine();

			System.out.println("Enter grade (0 to 100): ");
			int grade = sc.nextInt();
			sc.nextLine();

			try {
				if (grade < 0 || grade > 100) {
					throw new InvalidGradeException("Grade must be between 0 and 100.");
				}
				System.out.println("Student Name: " + name + ", Grade: " + grade);
			} catch (InvalidGradeException e) {
				System.out.println("Error: " + e.getMessage());
			}

		}
		System.out.println("Program Executed....");
	}

}
