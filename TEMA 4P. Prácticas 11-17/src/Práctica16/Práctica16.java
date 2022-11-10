package Práctica16;

import java.security.SecureRandom;

public class Práctica16 {

	public static void main(String[] args) {
		// Define tres arrays de 20 números enteros cada una, con nombres numero,
		// cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
		// Recuerda la clase Math.Random En el array cuadrado se deben almacenar los
		// cuadrados de los valores que hay en el array numero.En el array cubo se deben
		// almacenar los cubos de los valores que hay en numero. A continuación,muestra
		// el contenidode los tres array.Bueno esta práctica es un poco más complicado.

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		String texto1 = "";
		String texto2 = "";
		String texto3 = "";
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < numero.length; i++) {
			numero[i] = random.nextInt(100);
			cuadrado[i] = (int) Math.pow(numero[i], 2);
			cubo[i] = (int) Math.pow(numero[i], 3);
			texto1 = numero[i] + " " + texto1;
			texto2 = cuadrado[i] + " " + texto2;
			texto3 = cubo[i] + " " + texto3;
		}
		System.out.println("Los números generados aleatoriamente son: ");
		System.out.println(texto1);
		System.out.println("Los números generados anteriormente al cuadrado son: ");
		System.out.println(texto2);
		System.out.println("Los números genmrrados anteriormente al cubo son: ");
		System.out.println(texto3);

			}

	}


