package Task;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayEmployee {
    public void displayAll() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM Employee";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("ID\tName\t\tDepartment\tSalary");
            System.out.println("---------------------------------------------");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t\t" +
                    rs.getString("department") + "\t\t" +
                    rs.getDouble("salary")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
