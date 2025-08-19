package Day25;

import org.junit.jupiter.api.*;
import java.sql.SQLException;
import java.util.Date;

public class ShopServiceTest {

	private ShopService service;

	@BeforeEach
	void setup() {
		service = new ShopService();
	}

	@Test
	void testInsertCustomer() throws SQLException {
		Customer c = new Customer(0, "John Doe", "1234567890", "M", "123 Street", "NY", "10001");
		service.insertCustomer(c);

	}

	@Test
	void testInsertProduct() throws SQLException {
		Product p = new Product(0, "P001", "Laptop", 1200.50, 10, new Date());
		service.insertProduct(p, 1);

	}

	@Test
	void testBuyProduct() throws SQLException {
		service.buyProduct(11, 2); // productId, buyQty

	}

	@Test
	void testDisplayCustomerWithProducts() throws SQLException {
		service.displayCustomerWithProducts(1);

	}

}
