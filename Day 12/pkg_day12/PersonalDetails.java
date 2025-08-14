package pkg_day12;

import java.util.Scanner;

public class PersonalDetails {
	String name;
	String address;
	String phone; 
	String email; 
	String dob;
	
	
	
	public PersonalDetails(String name, String address, String phone, String email, String dob) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
	}


	
	void display() {
		System.out.println("\n---------Display Employee Personal Destails: ----------");
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address);
		System.out.println("Phone: "+ phone);
		System.out.println("Email: "+ email);
		System.out.println("DOB: "+ dob);
	}

}
