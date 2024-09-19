package ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio04Test {

	@Test
	void testEsPrimoDos() {
		boolean result = Ejercicio04.esPrimo(2);
		assertTrue(result);
	}
	
	@Test
	void testEsPrimoTres() {
		boolean result = Ejercicio04.esPrimo(3);
		assertTrue(result);
	}
	
	@Test
	void testEsPrimoNueve() {
		boolean result = Ejercicio04.esPrimo(9);
		assertTrue(result);
	}
	
	@Test
	void testEsPrimoCuatro() {
		boolean result = Ejercicio04.esPrimo(4);
		assertFalse(result);
	}

}
