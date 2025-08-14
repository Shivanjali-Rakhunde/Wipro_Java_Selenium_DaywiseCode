package jdbcmysql;
import java.sql.*;

public class StudentJDBC {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/java_selenium";
		String username = "root";
		String password = "Shivanjali@2525";

		try (Connection c = DriverManager.getConnection(url, username, password);

				Statement st = c.createStatement()) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String createTable = """
					    CREATE TABLE student1 (
					        id INT PRIMARY KEY,
				        name VARCHAR(50),
					        age INT,
					        email VARCHAR(50),
					        phone VARCHAR(20),
					        address VARCHAR(200),
					        gender VARCHAR(20),
				        branch VARCHAR(30),
					        year INT,
					        gpa DOUBLE
					    )
					""";

			st.executeUpdate(createTable);
			System.out.println("Table 'Student1' created successfully");

			String insertValue = """
					    INSERT INTO student1 (id, name, age, email, phone, address, gender, branch, year, gpa) VALUES
					    (1, 'Alice', 20, 'alice@example.com', '1234567890', 'Pune', 'Female', 'CS', 2, 8.75),
					    (2, 'Bob', 21, 'bob@example.com', '2345678901', 'Mumbai', 'Male', 'IT', 1, 7.5),
					    (3, 'Charlie', 22, 'charlie@example.com', '3456789012', 'Delhi', 'Male', 'ENTC', 3, 4.5),
					    (4, 'Diana', 20, 'diana@example.com', '4567890123', 'Solapur', 'Female', 'EEE', 4, 6.8),
					    (5, 'Eira', 23, 'eira@example.com', '5678901234', 'Kolhapur', 'Male', 'MECH', 4, 5.4),
					    (6, 'John', 19, 'fiona@example.com', '6789012345', 'Nashik', 'Female', 'CS', 1, 3.9),
				    (7, 'George', 24, 'george@example.com', '7890123456', 'Nagpur', 'Male', 'CIVIL', 4, 2.9),
				    (8, 'Hema', 21, 'hema@example.com', '8901234567', 'Dhule', 'Female', 'AI', 3, 3.4),
				    (9, 'Imran', 22, 'imran@example.com', '9012345678', 'Latur', 'Male', 'IT', 3, 9.8),
				    (10, 'Jiya', 20, 'jiya@example.com', '0123456789', 'Goa', 'Female', 'CS', 2, 8.88)					""";

			st.executeUpdate(insertValue);
			System.out.println("10 Student records inserted");

			String deleteValue = "DELETE FROM student1 WHERE id IN (2, 4)";
			st.executeUpdate(deleteValue);
			System.out.println("Records with ID 2 and 4 deleted.");

			String updateValue = """
					    UPDATE student1
					    SET email = 'updated_eira@example.com',
					        phone = '9999999999',
					        gpa = 9.5
					    WHERE id = 5
					""";

		st.executeUpdate(updateValue);
			System.out.println("Record with ID 5 Updated");
			
			//Displaying through student record
			
			String selqry = "select*from student1";
			
			ResultSet rs = st.executeQuery(selqry);
			while (rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("email")+" "+ rs.getDouble("gpa"));
			}

		}

		catch (ClassNotFoundException e1) {
			System.err.println("JDBC Driver not found: " + e1.getMessage());
		} catch (SQLException e) {
			System.err.println("SQL Error: " + e.getMessage());
		}
	}
}
