package ejercicio03;

public class Ejercicio03 {
	public static String numeroCadena(int n){
		String cadena = "";
		
		if(n % 3 == 0) {
			cadena += "fizz";
		}
		if(n % 5 == 0) {
			cadena += "buzz";
		}
		
		return cadena;
	}
}
