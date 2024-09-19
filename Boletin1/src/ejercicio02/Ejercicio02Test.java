package ejercicio02;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class Ejercicio02Test {

	@Test
	void testEsParDos() {
		boolean result = Ejercicio02.esPar(2);
		assertTrue(result);
	}
	
	@Test
	void testEsParCuatro() {
		boolean result = Ejercicio02.esPar(4);
		assertTrue(result);
	}
	
	@Test
	void testEsParUno() {
		boolean result = Ejercicio02.esPar(1);
		assertFalse(result);
	}
	
	@Test
	void testEsParCero() {
		boolean result = Ejercicio02.esPar(0);
		assertTrue(result);
	}

}
