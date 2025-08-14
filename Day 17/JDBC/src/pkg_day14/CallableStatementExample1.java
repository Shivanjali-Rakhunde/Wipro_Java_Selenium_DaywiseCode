package pkg_day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableStatementExample1 {
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
			      CallableStatement cstmt = (CallableStatement) con.prepareCall("{call myProcedure2(?, ?, ?)}");
			 
			      cstmt.setString(1, "John");
			      cstmt.setInt(2, 97);
			      cstmt.setInt(3, 1001);
			      cstmt.execute();
			     
			    
			 
			      cstmt.setString(1, "Doe");
			      cstmt.setInt(2, 60);
			      cstmt.setInt(3, 1002);
			      cstmt.execute();
			      
			 
			      cstmt.setString(1, "Reem");
			      cstmt.setInt(2, 98);
			      cstmt.setInt(3, 1003);
			      
			 
			      cstmt.execute();
			      System.out.println("Rows inserted ....");

		}catch(SQLException se) {se.printStackTrace();}

	}

}
