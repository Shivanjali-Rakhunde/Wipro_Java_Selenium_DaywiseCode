package pkg_day12task;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertRecord insert = new InsertRecord();
        DeleteRecord delete = new DeleteRecord();
        UpdateRecord update = new UpdateRecord();
        DisplayRecord display = new DisplayRecord();

        int choice;
        do {
            System.out.println("\nEmployee Menu");
            System.out.println("--------------");
            System.out.println("1. Insert a new Record");
            System.out.println("2. Delete a record");
            System.out.println("3. Update the record");
            System.out.println("4. Display all the records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice(1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insert.insertEmployee();
                    break;
                case 2:
                    delete.deleteEmployee();
                    break;
                case 3:
                    update.updateEmployee();
                    break;
                case 4:
                    display.displayAll();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }
}

