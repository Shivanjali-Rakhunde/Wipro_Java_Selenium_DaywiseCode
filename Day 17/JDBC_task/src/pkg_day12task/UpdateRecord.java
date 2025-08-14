package pkg_day12task;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {
    public void updateEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter new salary: ");
        double salary = sc.nextDouble();

        String updateSQL = "UPDATE employee SET salary = " + salary + " WHERE id = " + id;

        try {
            DBConnection db = new DBConnection();
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            int rows = stmt.executeUpdate(updateSQL);
            System.out.println(rows + " record(s) updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

