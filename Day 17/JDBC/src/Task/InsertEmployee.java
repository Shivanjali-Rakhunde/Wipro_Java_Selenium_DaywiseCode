package Task;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;



import java.sql.Connection;
import java.sql.Statement;

public class InsertEmployee {
    public void insertRecords() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            String[] queries = {
                "INSERT INTO Employee VALUES (1, 'Amit', 'HR', 30000)",
                "INSERT INTO Employee VALUES (2, 'Priya', 'IT', 50000)",
                "INSERT INTO Employee VALUES (3, 'Ravi', 'Finance', 45000)",
                "INSERT INTO Employee VALUES (4, 'Sneha', 'Marketing', 40000)",
                "INSERT INTO Employee VALUES (5, 'Raj', 'Admin', 35000)"
            };

            int count = 0;
            for (String sql : queries) {
                count += stmt.executeUpdate(sql);
            }

            System.out.println(count + " employee record(s) inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
