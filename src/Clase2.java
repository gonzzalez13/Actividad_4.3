import java.util.ArrayList;
import java.util.Scanner;
public class Clase2 {

	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		boolean  x = false;
		int sumatorio=0;
		System.out.println("### Programa de suma de n�meros y calculo de su media ###");
		
		
		introducirNumeros(lista, x);
		System.out.println(contarNum(lista,sumatorio));
		System.out.println(extracted(lista, sumatorio));
	}
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
	
	public static int contarNum(ArrayList<Integer> lista, int sumatorio) {
		for (int i = 0; i < lista.size(); i++) {
			sumatorio=sumatorio+lista.get(i);
		}
		
		return sumatorio;
	}
	
	
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
