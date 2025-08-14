package jdbcmysql;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecord {
    public void insertEmployee() {
        try {
            DBConnection db = new DBConnection();
            Connection con = db.getConnection();
            Statement st = con.createStatement();

            String insertSQL = "INSERT INTO employee (id, name, department, salary) "
                    + "VALUES (101, 'John', 'HR', 60000.0)";

            st.executeUpdate(insertSQL);

            System.out.println("Values inserted into employee table.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
