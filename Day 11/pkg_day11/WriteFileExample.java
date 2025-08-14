package pkg_day11;
import java.io.IOException;
import java.io.FileWriter;

public class WriteFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       try (FileWriter writer = new FileWriter("D://myfile.txt")) {
	           writer.write("Hello, Java File Handling!");
	        } catch (IOException e) {
	           e.printStackTrace();
	        }


	}

}
