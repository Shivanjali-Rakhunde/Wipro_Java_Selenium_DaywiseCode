//package pkg_day14;
//
//import java.sql.SQLException;
//
//import java.sql.*;
//public class PreparedStatementEx{
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/java_Selenium"; // Replace with your DB URL
//        String user = "root";
//        String password = "Shivanjali@2525";
// 
//        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
//        String delSQL ="delete from users where name=?";
//        String updSQL="update users set name=? where name='Harry Potter'";
//
//        try(
//            Connection conn = DriverManager.getConnection(url, user, password);
//
//            PreparedStatement pstmtIns = conn.prepareStatement(insertSQL);
//            PreparedStatement pstmtDel = conn.prepareStatement(delSQL);
//            PreparedStatement pstmtUpd= conn.prepareStatement(updSQL);
//
//          )   
//          {
//            // Set values for the placeholders
//          pstmtIns.setString(1, "Adam");
//          pstmtIns.setString(2, "adam@example.com");
//
//            //For deleting
//            pstmtDel.setString(1,"Adam");
//
//            //For updating
//            pstmtUpd.setString(1,"Harry");
//            int rowsInserted = pstmtIns.executeUpdate();
//            int rowsDeleted= pstmtDel.executeUpdate();
//            int rowsUpdated= pstmtUpd.executeUpdate();
//
//            System.out.println(rowsInserted + " row(s) inserted.");
//            System.out.println(rowsDeleted+ " row(s) deleted.");
//            System.out.println(rowsUpdated+ " row(s) updated.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
// 
//
//
