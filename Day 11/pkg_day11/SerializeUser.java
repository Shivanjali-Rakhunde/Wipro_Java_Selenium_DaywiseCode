package pkg_day11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class SerializeUser {
   public static void main(String[] args) throws Exception {
       User user = new User("alice", "alice@example.com", 23);
       System.out.println(user);
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://user.ser"));
      out.writeObject(user);
       out.close();
   }
}
