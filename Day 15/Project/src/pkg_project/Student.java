package pkg_project;

import java.util.ArrayList;

public class Student extends Person implements Registrable {
	private ArrayList<Course> registeredCourses;
	
	public Student(String id, String name) {
		super(id, name);
		this.registeredCourses = new ArrayList<>();
		
	}

	@Override
	public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
		if(registeredCourses.contains(course)) {
			throw new CourseAlreadyRegisteredException("Course already registered: "+ course.getCode());
		}
		
		registeredCourses.add(course);
		
	}

	@Override
	public void dropCourse(Course course) throws CourseNotFoundException {
		if (!registeredCourses.contains(course)) {
			throw new CourseNotFoundException("Course not found in registration: "+ course.getCode());
		}
		registeredCourses.remove(course);
		
	}
	
	public ArrayList<Course> getRegisteredCourses(){
		return registeredCourses;
	}

	@Override
	public String toString() {
		 return super.toString() + " | Courses: " + registeredCourses;
	}

	
	
	
	
	

}
