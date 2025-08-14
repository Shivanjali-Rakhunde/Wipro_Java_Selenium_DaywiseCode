package pkg_day12task;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public void createEmployeeTable() {
        try {
            DBConnection db = new DBConnection();
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();

            String createSQL = "CREATE TABLE employee ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "department VARCHAR(100), "
                    + "salary DOUBLE)";
            stmt.execute(createSQL);
            System.out.println(" Table 'employee' created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 
    public static void main(String[] args) {
        new CreateTable().createEmployeeTable();
    }
}
