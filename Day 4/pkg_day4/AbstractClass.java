package pkg_day4;


abstract class Animal{
	abstract void sound();
	
	void sleep() {
		System.out.println("Sleeping....");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}

public class AbstractClass {
public static void main(String[] args) {
	Animal myDog = new Dog();
	myDog.sound();
	myDog.sleep();
}
}
