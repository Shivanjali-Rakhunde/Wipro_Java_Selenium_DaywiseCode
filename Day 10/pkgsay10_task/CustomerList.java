package pkgsay10_task;

import java.util.*;

public class CustomerList {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		

		// Adding Customer
		customers.add(new Customer("C002", "John", 456789012, "Mumbai", "john@gmail.com", "Male"));
		customers.add(new Customer("C001", "Alice", 1234567890, "Pune", "alice@gmail.com", "Male"));
		customers.add(new Customer("C004", "Mina", 678911000, "Delhi", "mina@gmail.com", "Female"));
		customers.add(new Customer("C005", "Seeta", 888911000, "Solapur", "seets@gmail.com", "Female"));
		customers.add(new Customer("C003", "Jack", 678900000, "Nashik", "jack@gmail.com", "Male"));

		// Sort the list

//		Collections.sort(customers);
		System.out.println(" Customer List:");
		for (Customer c : customers) {
			System.out.println(c);
		}
		
		System.out.println();

		// Remove element from index 3

		customers.remove(3);
		System.out.println("After removing element at index 3:");
		for (Customer c : customers) {
			System.out.println(c);
		}
		
		System.out.println();

		// find  the customer "C003" in the list
		boolean found = false;
		for (Customer c : customers) {
			if (c.getId().equalsIgnoreCase("C003")) {
				System.out.println("Customer C003 found");
				System.out.println("Name:" + c.getName());
				System.out.println("Location: " + c.getLocation());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Customer C003 not found in the list.");
		}

	}

}
