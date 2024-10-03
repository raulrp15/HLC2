package ejercicio07;

import java.time.Year;

public class Ejercicio07 {
	static public boolean fecha(int dia, int mes, int anyo) {
		boolean esIgual = false;

		

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			if ((dia >= 1 && dia <= 31) && (anyo >= 0))
				esIgual = true;
		}
		case 4, 6, 9, 11 -> {
			if ((dia >= 1 && dia <= 31) && (anyo >= 0))
				esIgual = true;
		}
		case 2 -> {
			if ((dia >= 1 && dia <= 28) && (anyo >= 0))
				esIgual = true;
			else if((dia >= 1 && dia <= 28) && (anyo >= 0 && Year.isLeap(anyo)))
				esIgual = true;
		}
		}

		return esIgual;
	}
}
