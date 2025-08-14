package Test2.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Task2.java.StringSolution;

public class StringSolutionTest {

	StringSolution ss = new StringSolution();

	@Test
	public void testHighestFrequencyChar() {
		assertEquals('a', ss.highestFrequencyChar("banana"));
		assertEquals('l', ss.highestFrequencyChar("hello"));
	}

	@Test
	public void testReplaceFirstVowel() {
		assertEquals("-pple", ss.replaceFirstVowel("apple"));
		assertEquals("h-llo", ss.replaceFirstVowel("hello"));
	}

	@Test
	public void testConcatenate() {
		assertEquals("HelloWorld", ss.concatenate("Hello", "World"));
		assertEquals("StringQues", ss.concatenate("String", "Ques"));
	}

}
