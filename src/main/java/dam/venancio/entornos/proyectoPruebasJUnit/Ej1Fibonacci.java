package dam.venancio.entornos.proyectoPruebasJUnit;

public class Ej1Fibonacci {

	public static int fibonacci(int valor) {
		if (valor == 1)// caso base
			return 0;
		else if (valor == 2)// caso base
			return 1;
		else if (valor >= 3) {
			return ((fibonacci(valor - 1)) + (fibonacci(valor - 2))); // recursividad
		} else {
			System.out.println("El valor introducido es incorrecto (valores enteros >=1)");
			return -1;
		}
	}
}
