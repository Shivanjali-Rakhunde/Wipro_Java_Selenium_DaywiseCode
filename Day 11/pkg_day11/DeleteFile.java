package pkg_day11;

import java.io.File;
public class DeleteFile {
   public static void main(String[] args) {
	   double d = 10 / 3;
	   System.out.println(d);



       File file = new File("D://myfile.txt");
       if (file.delete()) {
          System.out.println("Deleted the file: " + file.getName());
       } else {
          System.out.println("Failed to delete the file.");
       }
     
}
}

