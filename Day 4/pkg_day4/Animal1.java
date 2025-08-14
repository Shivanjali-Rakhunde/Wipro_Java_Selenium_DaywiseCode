package pkg_day4;

 interface Animal1 {
	void sound();

}
 
 class Dog1 implements Animal1{
	 public void sound() {
		 System.out.println("Dog barks");
	 }
 }
 
 
 class Cat implements Animal1{
	 public void sound() {
		 System.out.println("Cat meows");
	 }
 }
 
 
 
