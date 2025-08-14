package pkg_project;

public class Main {

	public static void main(String[] args) {
		RegistrationManager manager = new RegistrationManager();
		
		Student s1 = new Student ("S001", "Shiv");
		Course c1 = new Course("JS101", "Java Selenium");
		Course c2 = new Course("DA102", "Data Analyst");
		
		manager.registerStudentForCourse(s1, c1);
		manager.registerStudentForCourse(s1, c1);
		manager.dropStudentFromCourse(s1, c2);
		
		manager.dropStudentFromCourse(s1, new Course("SAP301", "SAP"));
		manager.dropStudentFromCourse(s1, c1);
		
		
		System.out.println(s1);
	}

}
