package pkd_day12task;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(
	            new PersonalDetails("Alice", "Delhi", "1234567890", "alice@example.com", "15-06-2000"),
	            new ProfessionalDetails("Developer", "IT", "B.Tech", "Mr. Singh", 3),
	            new SalaryDetails(40000, 5000, 7000, 2000, 3000),
	            new LeaveDetails(30, 5, 8, 12),
	            new ProjectDetails("EMS", "Book Store", "Inventory System", "Backend Developer", "1 year")
	        ));
		
		employees.add(new Employee(
	            new PersonalDetails("Bob ", "Mumbai", "3216540987", "bob@example.com", "20-12-2002"),
	            new ProfessionalDetails("Tester", "QA", "MCA", "Ms. Rao", 5),
	            new SalaryDetails(35000, 12000, 4000, 1500, 2500),
	            new LeaveDetails(25, 4, 6, 10),
	            new ProjectDetails("HR System", "E-commerce", "Bug Tracker", "QA Engineer", "2 years")
	        ));
		
		while (true) {
            System.out.println("\n--- Employee List ---");
            for (int i = 0; i < employees.size(); i++) {
                System.out.println((i + 1) + ". Employee " + (i + 1));
            }
            System.out.println((employees.size() + 1) + ". Exit");

            System.out.print("Select an employee: ");
            int empChoice = sc.nextInt();
            if (empChoice == employees.size() + 1) {
                System.out.println("Exiting. Thank you!");
                break;
            }

            if (empChoice < 1 || empChoice > employees.size()) {
                System.out.println("Invalid employee selection.");
                continue;
            }

            Employee selected = employees.get(empChoice - 1);

            System.out.println("\n\tEmployee Menu");
            System.out.println("\t-------------");
            System.out.println("1. Display Personal Details.");
            System.out.println("2. Display Professional Details.");
            System.out.println("3. Display Salary Details.");
            System.out.println("4. Display Leave Details.");
            System.out.println("5. Display Project Details.");
            System.out.println("6. Go Back.");
            System.out.print("Enter your choice: ");
            int sectionChoice = sc.nextInt();

            if (sectionChoice == 6) continue;

            selected.displaySection(sectionChoice);
        }


	}

}
