package pkg_day14;

import java.sql.*;

public class StoredProceduresEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/java_selenium";
        String user = "root";
        String password = "Shivanjali@2525";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement()){
        	
        	String CreateAuthorTable = """
        			CREATE TABLE IF NOT EXISTS author(
        			author_id INT PRIMARY KEY,
        			authorName VARCHAR(30),
        			email VARCHAR(25),
        			gender VARCHAR(6)
        			)
        			""";
        	stmt.executeUpdate(CreateAuthorTable);
        	System.out.println("Table Author created successfully......");
        	
        String CreateBookTable = """

        		CREATE TABLE IF NOT EXISTS book(
        		BookId INT NOT NULL UNIQUE,
        		ISBN INT PRIMARY KEY,
        		book_name VARCHAR(30) NOT NULL,
        		author Int,
        		ed_num INT,
        		price INT,
        		pages INT,
        		FOREIGN KEY (author) references author (author_id)
        		)

        		""";
        
        stmt.executeUpdate(CreateBookTable);
        System.out.println("Table book created successfully...");
        	
        }

	 catch (SQLException e) {
        e.printStackTrace();
    }

}
}
