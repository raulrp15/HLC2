package ejercicio06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ejercicio06Test {

	@Test
	void testCalculadoraSuma() {
		double res = Ejercicio06.calculadora(1, 1, 1);
		assertEquals(res, 2);
	}
	@Test
	void testCalculadoraResta() {
		double res = Ejercicio06.calculadora(2, 1, 2);
		assertEquals(res, 1);
	}
	@Test
	void testCalculadoraMultiplicacion() {
		double res = Ejercicio06.calculadora(4, 2, 3);
		assertEquals(res, 8);
	}
	@Test
	void testCalculadoraDivision() {
		double res = Ejercicio06.calculadora(5, 2, 4);
		assertEquals(res, 2.5);
	}
	@Test
	void testCalculadoraDivision2() {
		ArithmeticException exc = assertThrows(ArithmeticException.class, () ->
        Ejercicio06.calculadora(1, 0, 4));
		
		assertEquals("No se puede dividir por 0", exc.getMessage());
	}
	
	@Test
	void testCalculadoraFallo() {
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () ->
        Ejercicio06.calculadora(1, 4, 6));
		
		assertEquals("No existe esa opcion", exc.getMessage());
	}

}
