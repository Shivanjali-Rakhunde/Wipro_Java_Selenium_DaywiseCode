package pkg_day12task;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecord {
    public void displayAll() {
        String selectSQL = "SELECT * FROM employee";

        try {
            DBConnection db = new DBConnection();
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("ID\tName\tDepartment\tSalary");
            System.out.println("---------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                double salary = rs.getDouble("salary");

                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

