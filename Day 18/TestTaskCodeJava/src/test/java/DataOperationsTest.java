package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.DataOperations;

public class DataOperationsTest {

	private static DataOperations dbOps;

	@BeforeAll
	public static void setupDatabase() throws Exception {
		dbOps = new DataOperations();
		dbOps.createTable();
	}

	@BeforeEach
	public void insertDefaultData() throws Exception {
	
		dbOps.deleteData(1);
		dbOps.insertData(1, "John", 5000.0);
	}

	@Test
	@DisplayName("Test Insert Data")
	public void testInsertData() throws Exception {
		dbOps.deleteData(2); 
		assertEquals(1, dbOps.insertData(2, "Alice", 6000.0));
		assertEquals("Alice", dbOps.getEmployeeName(2));
		System.out.println("Inserted Alice successfully!");
	}

	@Test
	@DisplayName("Test Update Data")
	public void testUpdateData() throws Exception {
		assertEquals(1, dbOps.updateData(1, "John Smith", 5500.0));
		assertEquals("John Smith", dbOps.getEmployeeName(1));
		System.out.println("Updated John to John Smith successfully!");
	}

	@Test
	@DisplayName("Test Delete Data")
	public void testDeleteData() throws Exception {
		assertEquals(1, dbOps.deleteData(1));
		assertNull(dbOps.getEmployeeName(1));
		System.out.println("Deleted ID=1 successfully!");
	}

	@AfterEach
	public void cleanUp() throws Exception {
		dbOps.deleteData(1);
		dbOps.deleteData(2);
	}

	@AfterAll
	public static void allDone() {
		System.out.println("All tests finished!");
	}
}
