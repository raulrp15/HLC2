package ejercicio07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio07Test {

	@Test
	void testFecha1() {
		boolean res = Ejercicio07.fecha(1, 1, 1);
		assertTrue(res);
	}
	@Test
	void testFecha2() {
		boolean res = Ejercicio07.fecha(35, 1, 1);
		assertFalse(res);
	}
	@Test
	void testFecha3() {
		boolean res = Ejercicio07.fecha(12, 14, 1);
		assertFalse(res);
	}
	@Test
	void testFecha4() {
		boolean res = Ejercicio07.fecha(12, 0, 1);
		assertFalse(res);
	}
	@Test
	void testFecha5() {
		boolean res = Ejercicio07.fecha(12, 3, -1);
		assertFalse(res);
	}
	@Test
	void testFecha6() {
		boolean res = Ejercicio07.fecha(31, 2, 2024);
		assertFalse(res);
	}
	@Test
	void testFecha7() {
		boolean res = Ejercicio07.fecha(29, 2, 2024);
		assertFalse(res);
	}

}
