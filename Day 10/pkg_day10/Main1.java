package pkg_day10;

import java.util.*;
class Person1{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
 
	public int getAge() {
		return age;
	}

	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return this.name + " " + this.age;
	}
}
 
public class Main1{
	public static void main(String[] args){
		List<Person1> person = Arrays.asList(
			new Person1("Brian",30),
			new Person1("Harry",23),
			new Person1("Brian",25)
		);
		System.out.println("Original List");
		System.out.println(person);
		person.sort(Comparator.comparing((Person1 p)->p.getName()).thenComparing(p->p.getAge()));
		System.out.println("Sorted list by name then by age: ");
		for(Person1 p:person){
			System.out.println(p);
		}	
	}
}	
