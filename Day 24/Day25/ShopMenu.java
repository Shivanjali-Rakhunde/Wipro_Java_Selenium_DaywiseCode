package Day25;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class ShopMenu {

	public static void main(String[] args) {
		ShopService service = new ShopService();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n===== SHOP MENU =====");
			System.out.println("1. Insert Customer");
			System.out.println("2. Insert Product");
			System.out.println("3. Buy Product");
			System.out.println("4. Display Customer & Products");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			
			int choice = sc.nextInt();
     		sc.nextLine();
			
			
			try {
				switch (choice) {
				case 1 -> {
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Contact: ");
					String contact = sc.nextLine();
					System.out.print("Enter Gender (M/F/O): ");
					String gender = sc.nextLine();
					System.out.print("Enter Address: ");
					String addr = sc.nextLine();
					System.out.print("Enter City: ");
					String city = sc.nextLine();
					System.out.print("Enter Zipcode: ");
					String zip = sc.nextLine();
					
					
					Customer c = new Customer(0, name, contact, gender, addr, city, zip);
					service.insertCustomer(c);
					System.out.println("Customer inserted successfully!");
				}
				
				case 2 -> {
                    System.out.print("Enter Customer ID (owner of product): ");
                    int custId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Code: ");
                    String code = sc.nextLine();
                    System.out.print("Enter Product Description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
                    String dateStr = sc.nextLine();
                    Date expDate = java.sql.Date.valueOf(dateStr);

                    Product p = new Product(0, code, desc, price, qty, expDate);
                    service.insertProduct(p, custId);
                    System.out.println("Product inserted successfully!");
                }
				
				
				case 3 -> {
                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Quantity to Buy: ");
                    int qty = sc.nextInt();

                    service.buyProduct(pid, qty);
                    System.out.println("Purchase successful!");
                }
				
				case 4 -> {
                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();
                    service.displayCustomerWithProducts(custId);
                }
				
				case 5 -> {
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                }
				
				default -> System.out.println("Invalid choice. Try again!");

				}
			}catch (SQLException e) {
                System.out.println("Database Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
			
		
		}

	}

}
