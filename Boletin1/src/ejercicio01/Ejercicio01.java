package ejercicio01;

public class Ejercicio01 {
	
	public static boolean esVocal(char letra) {
		boolean esVocal = false;
		char a = Character.toLowerCase(letra);
		
		switch (a) {
			case 'a', 'e', 'i', 'o', 'u'
				-> esVocal = true;
		}
		
		return esVocal;
	}
}
