package Task;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;



import java.sql.Connection;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteEmployee {
    public void deleteRecord() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            int id = 5; // Delete Raj
            String sql = "DELETE FROM Employee WHERE id = " + id;
            int rows = stmt.executeUpdate(sql);

            System.out.println(rows + " employee record(s) deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
