package com.ericsson.ma.maven.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals("wrong add result", 3, calculator.add(1, 2));
	}

	@Test
	public void testSub() {
		assertEquals("wrong sub result", 1, calculator.sub(2, 1));
	}

	@Test
	public void testMul() {
		assertEquals("wrong mul result", 2, calculator.mul(2, 1));
	}

	@Test
	public void testDiv() {
		assertEquals("wrong mul result", 2, calculator.div(2, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivByZero() {
		calculator.div(2, 1);
	}
}
