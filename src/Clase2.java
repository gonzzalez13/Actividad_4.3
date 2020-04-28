import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Manu
 *
 */
public class Clase2 {

	static Scanner sc=new Scanner (System.in);
	/**
	 * M�todo main
	 * En el m�todo main llamo a las funciones que contienen la funcionalidad principal del programa.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * He creado un arraylist para contener los n�meros que posteriormente se van a sumar.
		 * Tambi�n una variable boolean para crear un men� que el usuario manejar�.
		 * Por �ltimo, he creado una variable integer que ser� el sumatorio de los n�meros contenidos en el arraylist.
		 */
		ArrayList<Integer> lista = new ArrayList<Integer>();
		boolean  x = false;
		int sumatorio=0;
		System.out.println("### Programa de suma de n�meros y calculo de su media ###");
		
		
		introducirNumeros(lista, x);
		System.out.println(contarNum(lista,sumatorio));
		System.out.println(extracted(lista, sumatorio));
	}
	/**
	 * Esta funci�n tiene el objetivo de calcular la media de la suma de los n�meros contenidos en la variable sumatorio.
	 * @param lista
	 * @param sumatorio
	 * @return
	 */
	public static int extracted(ArrayList<Integer> lista, int sumatorio) {
		int tama�oLista;
		int calculoMedia;
		for (int i = 0; i < lista.size(); i++) {
			sumatorio=sumatorio+lista.get(i);
		}
		
		tama�oLista=lista.size();
		calculoMedia=sumatorio/tama�oLista;
		return calculoMedia;
	}
	/**
	 * Esta funci�n la he creado para que se sumen los n�meros que el usuario ha ido introduciendo en el arraylist.
	 * @param lista
	 * @param sumatorio
	 * @return
	 */
	public static int contarNum(ArrayList<Integer> lista, int sumatorio) {
		for (int i = 0; i < lista.size(); i++) {
			sumatorio=sumatorio+lista.get(i);
		}
		
		return sumatorio;
	}
	
	/**
	 * Este m�todo contiene el men� que el usuario manejar� para indicar si quiere seguir introduciendo n�meros en el arraylisto o no.
	 * @param lista
	 * @param x
	 */
	public static void introducirNumeros(ArrayList<Integer> lista, boolean x) {
		String resp;
		do {
			System.out.println("\nIntroduce n�mero");
			lista.add(Integer.parseInt(sc.nextLine()));
			System.out.println("�Quieres a�adir otro n�mero? s/n");
			resp=sc.nextLine();
			if(resp.equals("s")) {
				x=true;
			}else if(resp.equals("n")) {
				x=false;
			}
		}while(x==true);	
	}

}
