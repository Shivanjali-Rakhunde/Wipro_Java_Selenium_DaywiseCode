package pkg_day12task;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecord {
    public void insertEmployee() {
        try {
            DBConnection db = new DBConnection();
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();

            String insertSQL = "INSERT INTO employee (id, name, department, salary) VALUES "
                    + "(101, 'John', 'HR', 600000.0), "
                    + "(102, 'Doe', 'Marketing', 80000.0), "
                    + "(103, 'Alex', 'Finance', 700000.0)";
            
            int rows = stmt.executeUpdate(insertSQL);
            System.out.println("✅ " + rows + " record(s) inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

