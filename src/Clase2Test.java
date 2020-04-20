import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class Clase2Test {
	ArrayList<Integer> lista = new ArrayList<Integer>();
	@Test
	void testmedia() {
		lista.add(5);
		lista.add(5);
		lista.add(5);
		int resultado=Clase2.extracted(lista,5);
		assertEquals(6,resultado);
	}
	@Test
	void testcuenta() {
		lista.add(5);
		lista.add(5);
		int resultado=Clase2.contarNum(lista, 10);
		assertEquals(resultado,20);
	}

}
