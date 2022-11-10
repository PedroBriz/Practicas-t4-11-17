package Práctica13;

import java.util.Scanner;

public class Práctica13 {

	public static void main(String[] args) {
		// Crea un array de enteros con 10 números que deben ser pedidos por el teclado.
		// Los números que se introducen por teclado no deben ser superiores a 20, es
		// decir que pueden ser números del 1 al 20, si se introduce por ejemplo el 21,
		// en tal caso el programa termina. Muestra la suma de todos los números
		// introducidos por teclado y los números que hemos introducido en el array.

		
		int num[] = new int[10];
		int suma=0;
		int p=0;
		Scanner input = new Scanner(System.in);
		
		
		for (int i = 0;i<num.length; i++) {
			System.out.println("Digite un número entre el 0 y el 20" );
		num[i]=input.nextInt();
		if (num[i]>20 || num[i]<0) {
			
			i=10;
		}else {
			suma= suma + num[i];
			p++;
		}
		}
		
	
		System.out.println("El programa ha finalizado, la suma de todos los elementos es: "+ suma);
		System.out.println("Los números introducidos son: ");
		for (int i = 0; i<p;i++) {
			System.out.println(num[i]);
			input.close();
		}
		
	
	}

}
