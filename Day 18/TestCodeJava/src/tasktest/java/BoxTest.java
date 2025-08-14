package tasktest.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import task.java.Box;

public class BoxTest {

	Box box = new Box();

	@Test
	public void testAreaCircle() {
		double delta = 0.0001;
		assertEquals(78.5398, box.areaCircle(5), delta);
	}

	@Test
	public void testAreaTriangle() {
		assertEquals(25.0, box.areaTriangle(10, 5));
	}

	@Test
	public void testAreaSquare() {
		assertEquals(16.0, box.areaSquare(4));
	}

	@Test
	public void testAreaRectangle() {
		assertEquals(24.0, box.areaRectangle(8, 3));
	}
	@Test
	public void testSimpleInterest() {
		assertEquals(100.0, box.simpleInterest(1000, 5, 2));
	}

	@Test
	public void testAmount() {

		assertEquals(1202.5, box.amount());
	}

}
