package ejercicio05;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class Ejercicio05Test {

	@Test
	void testCapicua1() {
		boolean res = Ejercicio05.capicua(1);
		assertTrue(res);
	}
	@Test
	void testCapicua2() {
		boolean res = Ejercicio05.capicua(2);
		assertTrue(res);
	}
	@Test
	void testCapicua9() {
		boolean res = Ejercicio05.capicua(9);
		assertTrue(res);
	}
	@Test
	void testCapicua11() {
		boolean res = Ejercicio05.capicua(11);
		assertTrue(res);
	}
	@Test
	void testCapicua22() {
		boolean res = Ejercicio05.capicua(22);
		assertTrue(res);
	}
	@Test
	void testCapicua101() {
		boolean res = Ejercicio05.capicua(101);
		assertTrue(res);
	}
	@Test
	void testCapicua102() {
		boolean res = Ejercicio05.capicua(102);
		assertFalse(res);
	}
	@Test
	void testCapicua7227() {
		boolean res = Ejercicio05.capicua(7227);
		assertTrue(res);
	}
	@Test
	void testCapicua7207() {
		boolean res = Ejercicio05.capicua(7207);
		assertFalse(res);
	}

}
