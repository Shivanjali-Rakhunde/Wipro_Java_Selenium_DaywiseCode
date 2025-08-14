package main.java;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.*;

public class DataOperations {

	public void createTable() throws SQLException {
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "CREATE TABLE IF NOT EXISTS employees (" + 
		"id INT PRIMARY KEY, " +
	    "name VARCHAR(50), "+ 
		"salary DOUBLE)";
			conn.createStatement().execute(sql);
		}
	}

	public int insertData(int id, String name, double salary) throws SQLException {
		String sql = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";
		try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setDouble(3, salary);
			return stmt.executeUpdate();
		}
	}

	public int updateData(int id, String newName, double newSalary) throws SQLException {
		String sql = "UPDATE employees SET name = ?, salary = ? WHERE id = ?";
		try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, newName);
			stmt.setDouble(2, newSalary);
			stmt.setInt(3, id);
			return stmt.executeUpdate();
		}
	}

	public int deleteData(int id) throws SQLException {
		String sql = "DELETE FROM employees WHERE id = ?";
		try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			return stmt.executeUpdate();
		}
	}

	public String getEmployeeName(int id) throws SQLException {
		String sql = "SELECT name FROM employees WHERE id = ?";
		try (Connection conn = DBConnection.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getString("name");
			}
			return null;
		}
	}
}
