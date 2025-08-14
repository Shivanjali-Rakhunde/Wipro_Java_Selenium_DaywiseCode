package Task;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;



import java.sql.Connection;
import java.sql.Statement;

public class UpdateEmployee {
    public void updateRecord() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            int id = 2; // Update Priya
            String sql = "UPDATE Employee SET name = 'Priya Sharma', department = 'DevOps', salary = 60000 WHERE id = " + id;
            int rows = stmt.executeUpdate(sql);

            System.out.println(rows + " employee record(s) updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
