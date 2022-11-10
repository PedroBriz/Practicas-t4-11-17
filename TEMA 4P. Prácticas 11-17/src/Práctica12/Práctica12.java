package Práctica12;

public class Práctica12 {

	public static void main(String[] args) {
		// Seguimos con las prácticas de Array sencillas. Crea un array de 6 posiciones
		// de tipo char, repito de tipo char con los siguientes valores:
		// R,%,&,+,A,2Muestra los valores del array por pantalla.

		char[] caracter = new char[6];

		caracter[0] = 'R';
		caracter[1] = '%';
		caracter[2] = '&';
		caracter[3] = '+';
		caracter[4] = 'A';
		caracter[5] = '2';

		System.out.println("El array caracter contiene los siguientes elementos: ");

		for (int i = 0; i < 6; i++) {
			System.out.println(caracter[i]);
		}

	}

}
