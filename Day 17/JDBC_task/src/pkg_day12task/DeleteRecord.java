package pkg_day12task;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {
    public void deleteEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        String deleteSQL = "DELETE FROM employee WHERE id = " + id;
        try {
            DBConnection db = new DBConnection();
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            int rows = stmt.executeUpdate(deleteSQL);
            System.out.println(rows + " record(s) deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

