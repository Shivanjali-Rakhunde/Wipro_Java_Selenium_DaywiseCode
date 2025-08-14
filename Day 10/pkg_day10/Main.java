//package pkg_day10;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Student2 implements Comparable<Student2>{
//	private int id;
//	private String name;
//	
//	
//	public Student2(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//// NaturalOrdering by id
//	@Override
//	public int compareTo(Student2 s) {
//		// TODO Auto-generated method stub
//		return this.id - s.id;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + "]";
//	}
//	
//	
//	
//	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//		List<Student> list = new ArrayList<>();
//		list.add(new Student2(3,"Garry"));
//		list.add(new Student2(1,"Jane"));
//		list.add(new Student2(2, "Jackson"));
//		
//		Collections.sort(list);
//		//Bydefault the sort() static method of Collections class internally calls
//		//compareTo() method 
//		///to compare the 2 objects.
//		
//		for(Student s:list) {
//			System.out.println(s);
//		}
//	}
//
//}
