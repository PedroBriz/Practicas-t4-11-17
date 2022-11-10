package Practica14;

import java.util.Scanner;

public class Practica14 {

	public static void main(String[] args) {
		// Escribe un programa que lea 10 numeros por teclado y que luego los muestre en
		// orden inverso, es decir, el primero que se introduce es el último que debe
		// mostrarse.

		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i<array.length;i++) {
			System.out.println("Digite un número");
			array[i]= input.nextInt();
		}
		System.out.println("Los números inversamente introducidos son: ");
		input.close();
		for (int i = 9; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

}
