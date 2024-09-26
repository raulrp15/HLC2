package ejercicio04;

public class Ejercicio04 {
	public static boolean esPrimo(int n) {
		boolean esPrimo = (n != 1);
		int cont = 2;
		
		
		while(cont <= Math.sqrt(n) && !esPrimo) {
			if(n % cont == 0)
				esPrimo = false;
			cont++;
		}
		
		return esPrimo;
	}

}
