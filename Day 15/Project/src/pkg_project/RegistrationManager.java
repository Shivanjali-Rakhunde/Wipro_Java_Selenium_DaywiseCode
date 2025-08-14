package pkg_project;

public class RegistrationManager {
	
	public void registerStudentForCourse(Student student, Course course) {
		try {
			student.registerCourse(course);
			System.out.println("Successfully registered "+ student.getName()+ " for "+ course.getTitle());
		}catch(CourseAlreadyRegisteredException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void dropStudentFromCourse(Student student, Course course) {
		try {
			student.dropCourse(course);
			System.out.println("Successfully dropped "+ student.getName()+ " from "+ course.getTitle());
		}catch(CourseNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
