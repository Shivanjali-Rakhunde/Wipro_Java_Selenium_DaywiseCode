package pkg_day11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Brian", 20);
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://student.ser"))){
			out.writeObject(s1);
			System.out.println("Object serialized to student.ser");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
