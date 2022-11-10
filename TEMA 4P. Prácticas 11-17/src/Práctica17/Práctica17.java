package Práctica17;

import java.security.SecureRandom;
import java.util.Scanner;

public class Práctica17 {

	// Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
	// muestre por pantalla separados por espacios. El programa pedirá entonces por
	// teclado dos valores y a continuación cambiará todas las ocurrencias del
	// primer valor por el segundo en la lista generada anteriormente, y las del
	// segundo valor por el primero. Aquí te vendrá bien utilizar un If. Intenta
	// realizar la práctica por ti mismo, aunque es un poco compleja, si te ves muy
	// apurado avisa al profesor. Para generar números aleatorios, recuerda utilizar
	// la clase Math.

	public static void main(String[] args) {

		int[] num = new int[100];
		SecureRandom random = new SecureRandom();
		String x = "";
		Scanner input = new Scanner(System.in);
		int a;
		int b;

		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(20);
			x = x + num[i] + " ";
		}
		System.out.println("Los 100 números aleatorios son: " + x);
		System.out.println("Digite un número que será cambiado por otro:");
		a = input.nextInt();
		System.out.println("Digite el número que quieres que sea cambiado por el anterior:");
		b = input.nextInt();

		for (int i = 0; i < num.length; i++) {
			if (b == num[i]) {
				num[i] = a;
			}
			
		}
		x = "";
		for (int j = 0; j < num.length; j++) {
			x = x + num[j] + " ";
		}
		System.out.println("Los números nuevos son: " + x);
		input.close();
	}
}
