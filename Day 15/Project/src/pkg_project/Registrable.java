package pkg_project;

public interface Registrable {
	void registerCourse(Course course) throws CourseAlreadyRegisteredException;
	void dropCourse(Course course) throws CourseNotFoundException;

}
