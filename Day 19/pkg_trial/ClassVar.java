package pkg_trial;

public class ClassVar {
	
	private int id;
	private String name;
	public void getData() {
		id=102;
		name="Steve";
	}
	public void printData() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassVar obj = new ClassVar ();
		obj.getData();
		obj.printData();
	}
 

}
