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
	 * Método main
	 * En el método main llamo a las funciones que contienen la funcionalidad principal del programa.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * He creado un arraylist para contener los números que posteriormente se van a sumar.
		 * También una variable boolean para crear un menú que el usuario manejará.
		 * Por último, he creado una variable integer que será el sumatorio de los números contenidos en el arraylist.
		 */
		ArrayList<Integer> lista = new ArrayList<Integer>();
		boolean  x = false;
		int sumatorio=0;
		System.out.println("### Programa de suma de números y calculo de su media ###");
		
		
		introducirNumeros(lista, x);
		System.out.println(contarNum(lista,sumatorio));
		System.out.println(extracted(lista, sumatorio));
	}
	/**
	 * Esta función tiene el objetivo de calcular la media de la suma de los números contenidos en la variable sumatorio.
	 * @param lista
	 * @param sumatorio
	 * @return
	 */
	public static int extracted(ArrayList<Integer> lista, int sumatorio) {
		int tamañoLista;
		int calculoMedia;
		for (int i = 0; i < lista.size(); i++) {
			sumatorio=sumatorio+lista.get(i);
		}
		
		tamañoLista=lista.size();
		calculoMedia=sumatorio/tamañoLista;
		return calculoMedia;
	}
	/**
	 * Esta función la he creado para que se sumen los números que el usuario ha ido introduciendo en el arraylist.
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
	 * Este método contiene el menú que el usuario manejará para indicar si quiere seguir introduciendo números en el arraylisto o no.
	 * @param lista
	 * @param x
	 */
	public static void introducirNumeros(ArrayList<Integer> lista, boolean x) {
		String resp;
		do {
			System.out.println("\nIntroduce número");
			lista.add(Integer.parseInt(sc.nextLine()));
			System.out.println("¿Quieres añadir otro número? s/n");
			resp=sc.nextLine();
			if(resp.equals("s")) {
				x=true;
			}else if(resp.equals("n")) {
				x=false;
			}
		}while(x==true);	
	}

}
