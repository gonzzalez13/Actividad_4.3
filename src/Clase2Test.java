import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class Clase2Test {
	ArrayList<Integer> lista = new ArrayList<Integer>();
	/**
	 * Test de la funci�n que calcula la media
	 * Este primer caso de prueba almacena 3 n�meros en el arraylist, los n�meros son el 5.
	 * El resultado de la suma es 15 y del c�lculo de la media 5. Se trata de un test sin errores.
	 */
	@Test
	public void testmedia() {
		lista.add(5);
		lista.add(5);
		lista.add(5);
		int resultado=Clase2.extracted(lista,0);
		assertEquals(5,resultado);
	}
	/**
	 * Test de la funci�n que calcula la suma
	 * El segundo caso de prueba almacena 2 n�meros en el arraylist, los n�meros tambi�n son el 5.
	 * El resultado de la suma es 10 por lo tanto tambi�n se trata de un test sin errores.
	 */
	@Test
	public void testcuenta() {
		lista.add(5);
		lista.add(5);
		int resultado=Clase2.contarNum(lista, 0);
		assertEquals(resultado,10);
	}

}
