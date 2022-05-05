package dam.venancio.entornos.proyectoPruebasJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciTest {


	@ParameterizedTest
	@CsvSource({"1,0", "2,1", "12,89", "5,3", "25, 46368", "-5,-1"})
	void fibonacciTest (int valor, int esperado) {
		assertEquals(Ej1Fibonacci.fibonacci(valor), esperado);
	}

	@Test
	public void fibonacciImposible() {
		assertEquals(Ej1Fibonacci.fibonacci(-5), -1);
	}
	
	
	
	
}
