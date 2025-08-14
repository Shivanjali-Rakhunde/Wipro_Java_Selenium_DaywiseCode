package pkg_day10;

public class Student {
	private int age;
	private String name;
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	public Student(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	

}
