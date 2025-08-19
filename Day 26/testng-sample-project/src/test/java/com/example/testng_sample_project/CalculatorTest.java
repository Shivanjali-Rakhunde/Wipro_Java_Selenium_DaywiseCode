package com.example.testng_sample_project;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
 
	private Calculator calculator;

	   @BeforeClass
	   public void setUp() {
	       calculator = new Calculator();
	   }

	   @Test(priority = 1)
	   public void testAdd() {
	       int result = calculator.add(2, 3);
	       Assert.assertEquals(result, 5);
	   }

	   @Test(priority = 2)
	   public void testSubtract() {
	       int result = calculator.subtract(5, 2);
	       Assert.assertEquals(result, 3);
	   }
	   @Test(priority = 3)
	   public void testMultiplication() {
	       int result = calculator.multiplication(5, 2);
	       Assert.assertEquals(result, 10);
	   }
	   @Test(priority = 4)
	   public void testDivision() {
	       int result = calculator.division(4, 2);
	       Assert.assertEquals(result, 2);
	   }
	   @Test(priority = 5)
	   public void testModule() {
	       int result = calculator.modules(10, 3);
	       Assert.assertEquals(result, 1);
	   }
	   
	   
}
