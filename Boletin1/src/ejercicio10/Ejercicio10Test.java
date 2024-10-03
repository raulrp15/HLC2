package ejercicio10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ejercicio10Test {

	@Test
	void testEsPalindroma1() {
		boolean res = Ejercicio10.esPalindroma("ana");
		assertTrue(res);
	}
	@Test
	void testEsPalindroma2() {
		boolean res = Ejercicio10.esPalindroma("Ana");
		assertTrue(res);
	}
	@Test
	void testEsPalindroma3() {
		boolean res = Ejercicio10.esPalindroma("an na");
		assertTrue(res);
	}
	@Test
	void testEsPalindroma4() {
		boolean res = Ejercicio10.esPalindroma("A luna ese anula");
		assertTrue(res);
	}
	@Test
	void testEsPalindroma5() {
		boolean res = Ejercicio10.esPalindroma("A luna ese aluna");
		assertFalse(res);
	}

}
