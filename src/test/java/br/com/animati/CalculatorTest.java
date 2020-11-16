package br.com.animati;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calc;
	
	@Before
	public void init() {
		calc = new CalculatorImpl();
	}
	
	@Test
	public void sum() {
		int a = 5;
		int b = 15;
		
		assertEquals(20, calc.sum(a, b));
	}

	@Test
	public void subtraction() {
		int a = 5;
		int b = 10;
		
		assertEquals(5, calc.subtraction(b, a));
	}

	//int multiplication(int a, int b);

	//int divison(int a, int b) throws Exception;

	//boolean equalIntegers(int a, int b);

}
