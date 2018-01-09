package javass;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcTest {

	@Test
	public void testAdd() {
		calc test = new calc();
		assertTrue(calc.add(1, 2) == 3);
	}

	@Test
	public void testSub() {
		calc test = new calc();
		assertTrue(calc.sub(5, 3) == 2);
	}

	@Test
	public void testMul() {
		calc test = new calc();
		assertTrue(calc.mul(2, 2)==4);
	}

}
