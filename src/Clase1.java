import java.util.Scanner;
/**
 * 
 * @author Usuaio
 *
 */
public class Clase1 {
	static Scanner sc=new Scanner (System.in);
	/**
	 *Primero Creamos la arrays, despues hacemos que el usuario la rellene por pantalla 
	 * @param args
	 */
	public static void main(String[] args) {
	int suma=0;
	int numero [] = new int [5];
	
	System.out.println("Escribe 5 números");
	
	for (int i = 0; i <5; i++) {
		System.out.println("Número "+(i+1));
		numero[i] =  sc.nextInt();
	}
	
	System.out.println("hay "+numeros(suma,numero)+" que terminan en 3");
	
	}
/**
 * Tenemos la arrays rellenado con los 5 numeros
 * ahora la recorremos con un for y con un if descublimos que numeros terminan en 3 
 * los numero que terminan en 3 se hace un sumatorio para saber cuantos hay en la array. 
 * @param suma --- Total de numeros que terminan en 3
 * @param numero --- array donde se encuentran los numeros
 * @return
 */
	public static int numeros(int suma,int numero []) {

		for (int i = 0; i < numero.length; i++) {
			if(numero[i]%10==3) {
				suma+=1;
			}
		}

		return suma;		
	}
}

		

	

	

