package pkg_day12;

import java.util.Scanner;

public class ProfessionalDetails {
	String designation, department, qualification, manager,experience;
	
	
	

	
	public ProfessionalDetails(String designation, String department, String qualification, String manager,
			String experience) {
	
		this.designation = designation;
		this.department = department;
		this.qualification = qualification;
		this.manager = manager;
		this.experience = experience;
	}



	



	void dispaly() {
		System.out.println("\n-----Display Employee Professional Details: -----");
		System.out.println("Designation: "+ designation);
		System.out.println("Department: "+ department);
		System.out.println("Qualification: "+ qualification);
		System.out.println("Manager: "+ manager);
		System.out.println("Experience: "+ experience);
		
	}

	

}
