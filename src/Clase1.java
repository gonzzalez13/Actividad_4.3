import java.util.Scanner;
public class Clase1 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
	int suma=0;
	int numero [] = new int [5];
	
	numeros(suma,numero);
	
	}
	public static void numeros(int suma,int numero []) {
		System.out.println("Escribe 5 numeros");
		for (int i = 0; i <5; i++) {
			System.out.println("Numero "+(i+1));
			numero[i] =  sc.nextInt();
		}
		for (int i = 0; i < numero.length; i++) {
			if(numero[i]%10==3) {
				suma+=1;
			}
		}
		
		System.out.println("Ahi "+suma+" numeros que acaban en 3");
		}
}
