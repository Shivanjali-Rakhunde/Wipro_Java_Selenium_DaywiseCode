package Test.java;

import Task.java.TaskSolution;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;





public class TestTask {
	TaskSolution ts = new TaskSolution();
	
	@Test
    public void testPrintReverseTable() {
        int num = 3;
        String expected =
                "3 x 10 = 30\n" +
                "3 x 9 = 27\n" +
                "3 x 8 = 24\n" +
                "3 x 7 = 21\n" +
                "3 x 6 = 18\n" +
                "3 x 5 = 15\n" +
                "3 x 4 = 12\n" +
                "3 x 3 = 9\n" +
                "3 x 2 = 6\n" +
                "3 x 1 = 3";
        assertEquals(expected, ts.printReverseTable(num));
    }

	@Test
	public void testAlphabets() {
		assertEquals("abcdefghijklmnopqrstuvwxyz", ts.printAlphabets());
	}

	@Test
	public void testASCIIValues() {
		String[] ascii = ts.printASCIIValues();
		assertEquals("A = 65", ascii[65]);
	}

	@Test
	public void testFactorial() {
		assertEquals(120, ts.factorial(5));
		assertEquals(1, ts.factorial(0));
	}

	@Test
	public void testCountPosNegZero() {
		assertArrayEquals(new int[] { 3, 2, 2 }, ts.countPosNegZero());
	}

	@Test
	public void testFindLargestSmallest() {
		assertArrayEquals(new int[] { 85, -100 }, ts.findLargestSmallest());
	}

	@Test
	public void testDivisibleBy9() {
		assertArrayEquals(new int[] { 11, 1683 }, ts.divisibleBy9());
	}

	@Test
	public void testOnesComplement() {
		assertEquals(-3, ts.onesComplement(2));
	}

	@Test
	public void testTwosComplement() {
		assertEquals(-2, ts.twosComplement(2));
	}

	@Test
	public void testFibonacci() {
		assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 }, ts.fibonacci(10));
	}
}
