package ejercicio09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ejercicio09Test {

	@Test
	void testBinario1() {
		String res = Ejercicio09.binario(2);
		assertEquals("10", res);
	}
	@Test
	void testBinario2() {
		String res = Ejercicio09.binario(4);
		assertEquals("100", res);
	}
	
	@Test
	void testBinario3() {
		String res = Ejercicio09.binario(8);
		assertEquals("1000", res);
	}
	
	@Test
	void testBinario4() {
		String res = Ejercicio09.binario(1);
		assertEquals("01", res);
	}
	
	@Test
	void testBinario5() {
		String res = Ejercicio09.binario(1);
		assertEquals("01", res);
	}

}
