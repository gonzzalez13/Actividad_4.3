import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class Clase1Test {
/**
 * En el primer JUNIT es para saber si la operacion de saber cuantos numeros acabados en 3 esta correcta, en este caso solo ahi 1.
 */
	@Test
	//Test con un 3 en el array
	public void testNumeros() {
		int numero [] = new int [] {1,2,3,4,5};
		int resultado = Clase1.numeros(0,numero);
		assertEquals(resultado, 1);

	}
	/**
	 * En el SEGUNDO JUNIT es para saber si la operacion de saber cuantos numeros acabados en 3 esta correcta, en este caso solo ahi 2.
	 */
	@Test
	//Test con dos 3 en el array
	public void testNumeros1() {
		int numero [] = new int [] {1,2,3,3,5};
		int resultado = Clase1.numeros(0,numero);
		assertEquals(resultado, 2);
		
	}
	/**
	 * En el tercer JUNIT es para saber si la operacion de saber si da error por que tendria que dar 3 y solo hay en los parametros se le pone 2
	 */
	@Test
	//Test fallido
	public void testNumeros2() {
		int numero [] = new int [] {1,2,3,3,3};
		int resultado = Clase1.numeros(0,numero);
		assertEquals(resultado, 2);
		
	}
		
}
