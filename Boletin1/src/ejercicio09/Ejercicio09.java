package ejercicio09;

import java.util.ArrayList;

public class Ejercicio09 {

	public static String binario(int n) {

		ArrayList<String> lista = new ArrayList<String>();
		String res = "";
		int resto;

		do {
			resto = n%2;
			n /= 2;
			lista.add(0, Integer.toString(resto));
		}while(n >= 2);
		
		lista.add(0, Integer.toString(n));
		
		for(int i = 0; i<lista.size(); i++) {
			res += lista.get(i);
		}

		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(binario(1));
	}
}
