package pkg_day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableStatementExample {
	static Connection con = null;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			//Replace with your database name
			String url="jdbc:mysql://localhost:3306/java_selenium";
			 
		       // Replace with your MySQL username
		       String username = "root";
		 
		       // Replace with your MySQL password
		       String password = "Shivanjali@2525";
		       
		    // Load MySQL Type-4 driver class
		        Class.forName("com.mysql.cj.jdbc.Driver");
		 
		         // Establish connection
		         con = DriverManager.getConnection(url, username, password);

		//Preparing a CallableStateement
		      CallableStatement cstmt = (CallableStatement) con.prepareCall("{call myProcedure(?, ?, ?)}");
		 
		      cstmt.setString(1, "Harry");
		      cstmt.setInt(2, 2000);
		      cstmt.setInt(3, 101);
		     
		    
		 
		      cstmt.setString(1, "Tom");
		      cstmt.setInt(2, 6000);
		      cstmt.setInt(3, 102);
		      
		 
		      cstmt.setString(1, "Potter");
		      cstmt.setInt(2, 1000);
		      cstmt.setInt(3, 103);
		      
		 
		      cstmt.execute();
		      System.out.println("Rows inserted ....");


		}
		catch(SQLException se) {se.printStackTrace();}
		
	

	}

}
