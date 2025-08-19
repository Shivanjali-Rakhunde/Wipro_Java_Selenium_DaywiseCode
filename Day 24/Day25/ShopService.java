package Day25;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ShopService {
	
	//Insert the data in the Customer table
	public void insertCustomer(Customer customer) throws SQLException{
		String sql = "INSERT INTO Customer(cust_name, cust_contact, cust_gender, cust_addr, city, zipcode) VALUES (?, ?, ?, ?, ?, ?)";

		try(Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setString(1, customer.getCustName());
			ps.setString(2, customer.getCustContact());
			ps.setString(3, customer.getCustGender());
			ps.setString(4, customer.getCustAddr());
			ps.setString(5, customer.getCity());
			ps.setString(6, customer.getZipcode());
			ps.executeUpdate();
			
		}
	}
	
	//Insert the data in the Product table
	
	/*public void insertProduct(Product product, int custId) throws SQLException{
		String sql = "INSERT INTO Product(cust_id, product_code, product_desc, product_price, product_qty, product_expdate) VALUES (?, ?, ?, ?, ?, ?)";

		try(Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setInt(1, custId);
            ps.setString(2, product.getProductCode());
            ps.setString(3, product.getProductDesc());
            ps.setDouble(4, product.getProductPrice());
            ps.setInt(5, product.getProductQty());
            ps.setDate(6, new java.sql.Date(product.getProductExpDate().getTime()));
            ps.executeUpdate();
		}
	}*/
	
	public void insertProduct(Product product, int custId) throws SQLException {
	    String sql = "INSERT INTO Product(cust_id, product_code, product_desc, product_price, product_qty, product_expdate) " +
	                 "VALUES (?, ?, ?, ?, ?, ?)";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setInt(1, custId);
	        ps.setString(2, product.getProductCode());
	        ps.setString(3, product.getProductDesc());
	        ps.setDouble(4, product.getProductPrice());
	        ps.setInt(5, product.getProductQty());
	        ps.setDate(6, new java.sql.Date(product.getProductExpDate().getTime()));

	        ps.executeUpdate();
//	        System.out.println("Product inserted successfully!");

	    } catch (SQLException e) {
	        if (e.getMessage().contains("Duplicate entry")) {
	            System.out.println("Product with code '" + product.getProductCode() + "' already exists. Please use a different code.");
	        } else {
	            throw e; // rethrow other SQL exceptions
	        }
	    }
	}

	
	// Buy the products wrt the customer
	 /*public void buyProduct(int productId, int qty) throws SQLException {
	        String sql = "UPDATE Product SET product_qty = product_qty - ? WHERE product_id = ? AND product_qty >= ?";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {
	            ps.setInt(1, qty);
	            ps.setInt(2, productId);
	            ps.setInt(3, qty);
	            int rows = ps.executeUpdate();
	            if (rows == 0) {
	                throw new SQLException("Not enough stock or invalid product.");
	            }
	        }
	    }*/
	
	public void buyProduct(int productId, int quantity) throws SQLException {
	    String query = "SELECT product_qty FROM Product WHERE product_id = ?";
	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement ps = conn.prepareStatement(query)) {
	        ps.setInt(1, productId);
	        ResultSet rs = ps.executeQuery();
	        
	        if (rs.next()) {
	            int stock = rs.getInt("product_qty");
	            if (stock >= quantity) {
	                // Update stock and sold_qty
	                String update = "UPDATE Product SET product_qty = product_qty - ?, sold_qty = sold_qty + ? WHERE product_id = ?";
	                try (PreparedStatement ps2 = conn.prepareStatement(update)) {
	                    ps2.setInt(1, quantity);
	                    ps2.setInt(2, quantity);
	                    ps2.setInt(3, productId);
	                    ps2.executeUpdate();
	                }
//	                System.out.println("Purchase successful!");
	            } else {
	                throw new SQLException("Not enough stock.");
	            }
	        } else {
	            throw new SQLException("Invalid product.");
	        }
	    }
	}

	 
	 //Display the customer data wrt products and total price.
	 /*public void displayCustomerWithProducts(int custId) throws SQLException {
	        String sql = """
	            SELECT c.cust_name, p.product_code, p.product_desc, p.product_price, p.product_qty
	            FROM Customer c 
	            JOIN Product p ON c.cust_id = p.cust_id
	            WHERE c.cust_id = ?;
	            """;
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {
	            ps.setInt(1, custId);
	            ResultSet rs = ps.executeQuery();

	            double totalPrice = 0;
	            while (rs.next()) {
	                System.out.println("Customer: " + rs.getString("cust_name"));
	                System.out.println("Product: " + rs.getString("product_code") + " - " + rs.getString("product_desc"));
	                System.out.println("Price: " + rs.getDouble("product_price"));
	                System.out.println("Qty: " + rs.getInt("product_qty"));
	                System.out.println("---------------------------");
	                totalPrice += rs.getDouble("product_price") * rs.getInt("product_qty");
	            }
	            System.out.println("Total Price: " + totalPrice);
	        }
	    }*/
	
	public void displayCustomerWithProducts(int custId) throws SQLException {
	    String query = "SELECT c.cust_name, p.product_code, p.product_desc, p.product_price, p.sold_qty " +
	                   "FROM Customer c JOIN Product p ON c.cust_id = p.cust_id WHERE c.cust_id = ?";
	    
	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement ps = conn.prepareStatement(query)) {
	        ps.setInt(1, custId);
	        ResultSet rs = ps.executeQuery();
	        
	        double totalAmount = 0;
	        boolean hasProducts = false;

	        while (rs.next()) {
	            hasProducts = true;
	            String cname = rs.getString("cust_name");
	            String code = rs.getString("product_code");
	            String desc = rs.getString("product_desc");
	            double price = rs.getDouble("product_price");
	            int boughtQty = rs.getInt("sold_qty");
	            
	            double amount = boughtQty * price;
	            totalAmount += amount;

	            System.out.println("Customer: " + cname);
	            System.out.println("Product: " + code + " - " + desc);
	            System.out.println("Price: " + price);
	            System.out.println("Bought Qty: " + boughtQty);
	            System.out.println("Amount: " + amount);
	            System.out.println("---------------------------");
	        }

	        if (hasProducts) {
	            System.out.println("Total Amount Spent: " + totalAmount);
	        } else {
	            System.out.println("No products found for this customer.");
	        }
	    }
	}

}
