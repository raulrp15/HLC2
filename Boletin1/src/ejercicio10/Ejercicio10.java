package ejercicio10;

public class Ejercicio10 {
	
	public static boolean esPalindroma(String frase) {
		String fraseSinEspacios;
		
		String fraseReves = "";
		
		boolean esPalindroma = false;

		fraseSinEspacios = frase.replace(" ", "").toLowerCase();
		
		for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
			fraseReves += fraseSinEspacios.charAt(i);
		}

		if (fraseReves.equalsIgnoreCase(fraseSinEspacios)) {
			esPalindroma = true;
		}

		return esPalindroma;
	}
}
