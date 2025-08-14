package pkg_day12;

import java.util.Scanner;

public class ProjectDetails {
	String project1, project2, project3, role, duration;
	
	
	
public ProjectDetails(String project1, String project2, String project3, String role, String duration) {
		super();
		this.project1 = project1;
		this.project2 = project2;
		this.project3 = project3;
		this.role = role;
		this.duration = duration;
	}




	
	void display() {
		 System.out.println("\n----Display Employee Project Details: ----");
	        System.out.println("Project 1: " + project1);
	        System.out.println("Project 2: " + project2);
	        System.out.println("Project 3: " + project3);
	        System.out.println("Role: " + role);
	        System.out.println("Duration: " + duration);
	}

}
