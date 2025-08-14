package pkg_day12;

import java.util.Scanner;

public class EmplyeeMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonalDetails personal = new PersonalDetails("John", "Mumbai", "1234567890", "john@gmail.com", "01-Jan-2000");
		ProfessionalDetails professional = new ProfessionalDetails("Software Developer", "IT", "B.Tech", "Mr.Doe",
				"3 Years");
		SalaryDetails salary = new SalaryDetails(30000, 2000, -3000);
		LeaveDetails leave = new LeaveDetails(30, 5, 8, 12, 18);
		ProjectDetails projects = new ProjectDetails("Employee Management System", "Online Book Store",
				"Transaction Tracking System", "Backend Developer", "1 Year");

		while (true) {
			System.out.println("\n\tEmployee Menu");
			System.out.println("\t-------------");
			System.out.println("1. Display Employee Personal Details.");
			System.out.println("2. Display Employee Professional Details.");
			System.out.println("3. Display Employee Salary Details.");
			System.out.println("4. Display Employee Earned Leaves and Casual Leaves.");
			System.out.println("5. Display Employee Projects Undertaken.");
			System.out.println("6. Exit the Menu.");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:

				personal.display();
				break;
			case 2:

				professional.dispaly();
				break;
			case 3:

				salary.display();
				break;
			case 4:

				leave.display();
				break;
			case 5:

				projects.display();
				break;
			case 6:
				System.out.println("\nExiting. Thank you!");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice! Please enter a number between 1 and 6.");
			}

		}

	}
}
