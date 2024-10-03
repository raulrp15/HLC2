package ejercicio08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Ejercicio08Test {

	@Test
	void testFibonacci() {
		int res = Ejercicio08.fibonacci(1);
		assertEquals(1, res);
	}
	@Test
	void testFibonacci2() {
		int res = Ejercicio08.fibonacci(2);
		assertEquals(1, res);
	}
	@Test
	void testFibonacci3() {
		int res = Ejercicio08.fibonacci(10);
		assertEquals(55, res);
	}
	@Test
	void testFibonacci4() {
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () ->
        Ejercicio08.fibonacci(0));
		
		assertEquals("El numero no puede ser menor a 1", exc.getMessage());
	}

}
