package ejercicio03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ejercicio03Test {

	@Test
	void testNumeroCadenaTres() {
		String result = Ejercicio03.numeroCadena(3);
		assertEquals("fizz", result);
	}
	
	@Test
	void testNumeroCadenaSeis() {
		String result = Ejercicio03.numeroCadena(6);
		assertEquals("fizz", result);
	}
	
	@Test
	void testNumeroCadenaCinco() {
		String result = Ejercicio03.numeroCadena(5);
		assertEquals("buzz", result);
	}
	
	@Test
	void testNumeroCadenaDiez() {
		String result = Ejercicio03.numeroCadena(10);
		assertEquals("buzz", result);
	}
	
	@Test
	void testNumeroCadenaQuince() {
		String result = Ejercicio03.numeroCadena(15);
		assertEquals("fizzbuzz", result);
	}
	
	@Test
	void testNumeroCadenaDos() {
		String result = Ejercicio03.numeroCadena(2);
		assertEquals("", result);
	}
	
}
