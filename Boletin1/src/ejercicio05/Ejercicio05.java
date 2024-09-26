package ejercicio05;

public class Ejercicio05 {

	public static boolean capicua(int n) {
		boolean res = false;
		
		int aux = n;
		
		int cifra;
		int inverso = 0;
		
		while(aux != 0) {
			cifra = aux % 10;
			inverso = inverso * 10 + cifra;
			aux = aux /10;
		}
		
		if(n == inverso)
			res = true;
		
		return res;
	}
}
