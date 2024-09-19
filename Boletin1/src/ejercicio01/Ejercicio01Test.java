package ejercicio01;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio01Test {
	
	@ParameterizedTest
	@MethodSource("vocalista")
	void testEsVocal(char letra, boolean esperado) {
		boolean obtenido = Ejercicio01.esVocal(letra);
		assertEquals(esperado, obtenido);
	}
	
	private static Stream<Arguments> vocalista(){
		return Stream.of(
					Arguments.of('a', true),
					Arguments.of('e', true),
					Arguments.of('i', true),
					Arguments.of('o', true),
					Arguments.of('u', true),
					Arguments.of('m', false)
				);
	}

	@Test
	void testEsVocalA() {
		boolean result = Ejercicio01.esVocal('a');
		assertTrue(result);
	}
	@Test
	void testEsVocalE() {
		boolean result = Ejercicio01.esVocal('e');
		assertTrue(result);
	}
	@Test
	void testEsVocalI() {
		boolean result = Ejercicio01.esVocal('i');
		assertTrue(result);
	}
	@Test
	void testEsVocalO() {
		boolean result = Ejercicio01.esVocal('o');
		assertTrue(result);
	}
	@Test
	void testEsVocalU() {
		boolean result = Ejercicio01.esVocal('u');
		assertTrue(result);
	}
	@Test
	void testEsVocalConsonante() {
		boolean result = Ejercicio01.esVocal('m');
		assertFalse(result);
	}
}
