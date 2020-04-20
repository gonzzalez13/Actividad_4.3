import java.util.Scanner;
public class Clase1 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
	int suma=0;
	int numero [] = new int [5];
	
	System.out.println("Escribe 5 numeros");
	System.out.println("hay "+numeros(suma,numero)+" que terminan en 3");
	
	}
	public static int numeros(int suma,int numero []) {
		
		
		for (int i = 0; i <5; i++) {
			System.out.println("Numero "+(i+1));
			numero[i] =  sc.nextInt();
		}
		for (int i = 0; i < numero.length; i++) {
			if(numero[i]%10==3) {
				suma+=1;
			}
		}
		
		return suma;
		}
}
