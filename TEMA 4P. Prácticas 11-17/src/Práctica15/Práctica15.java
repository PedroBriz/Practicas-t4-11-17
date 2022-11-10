package Práctica15;

import java.util.Scanner;

public class Práctica15 {

	public static void main(String[] args) {
		// Escribe un programa que pida 10 números enteros por teclado y que vaya
		// comparando el número introducido con el máximo o el mínimo valor que puede
		// tener una variable, si el número introducido coincide con el valor máximo o
		// mínimo lo indicaremos por pantalla.

		int[] array = new int[10];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce un número");
			array[i] = input.nextInt();

			if (array[i] < Integer.MAX_VALUE && array[i] > Integer.MIN_VALUE) {
				System.out.println(
						"El número seleccionado en el array " + i + " está entre el máximo y mínimo de la variable");
			} else {
				System.out.println("El número seleccionado en el array " + i
						+ " coincide con el máximo o mínimo de la variable int");
			}
		}
		input.close();
	}
}
