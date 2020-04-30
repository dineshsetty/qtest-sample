package com.sample.qtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {

	@Test
	public void testFindMax() {
		assertEquals(4, SampleCalculation.findMax(new int[] { 1, 3, 4, 2 }));
	}

	@Test
	public void testSquare() {
		assertEquals(0, 1);
	}

	@Test
	public void testCube() {
		assertEquals(27, SampleCalculation.cube(3));
	}

	@Test
	public void testReverseWord() {
		assertEquals("tseTq elpmaS ", SampleCalculation.reverseWord("qTest Sample"));
	}

	@Test
	public void testIsPalindrome() {
		assertEquals(0, 1);
	}

}
