package ejercicio06;

public class Ejercicio06 {

	public static double calculadora(double n1, double n2, int opc) {
		
		double res = 0.0;
		
		switch(opc) {
		case 1 -> res = n1 + n2;
		case 2 -> res = n1 - n2;
		case 3 -> res = n1 * n2;
		case 4 -> {
			if(n2 != 0)
				res = n1 / n2;
			else
				throw new ArithmeticException("No se puede dividir por 0");
			}
		default -> throw new IllegalArgumentException("No existe esa opcion");
		}
		
		return res;
	}
}
