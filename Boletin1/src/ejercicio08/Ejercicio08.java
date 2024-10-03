package ejercicio08;

public class Ejercicio08 {

	public static int fibonacci(int n) {

		int res = 0;

		if(n < 1)
			throw new IllegalArgumentException("El numero no puede ser menor a 1");
		else {
			if (n == 1 || n == 2) {
				res = 1;
			}else
				res = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}

}
