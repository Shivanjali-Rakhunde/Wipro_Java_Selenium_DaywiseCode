package pkg_project;

import java.util.Objects;

public class Course {
	private String code;
	private String title;
	
	public Course (String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public String getCode() {
		return code;
	}
	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Course [code=" + code + ", title=" + title + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Course))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(code, other.code);
	}
	
	
	
	
	
	

}
