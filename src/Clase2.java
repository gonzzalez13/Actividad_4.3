import java.util.ArrayList;
import java.util.Scanner;
public class Clase2 {

	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		boolean  x = false;
		int sumatorio=0;
		System.out.println("### Programa de suma de números y calculo de su media ###");
		
		introducirNumeros(lista, x);
			
		extracted(lista, sumatorio);
	}
	private static void extracted(ArrayList<Integer> lista, int sumatorio) {
		int tamañoLista;
		int calculoMedia;
		for (int i = 0; i < lista.size(); i++) {
			sumatorio=sumatorio+lista.get(i);
		}
		
		tamañoLista=lista.size();
		calculoMedia=sumatorio/tamañoLista;
		System.out.println("La suma de los números es "+sumatorio+" y la media es "+calculoMedia);
	}
	private static void introducirNumeros(ArrayList<Integer> lista, boolean x) {
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
