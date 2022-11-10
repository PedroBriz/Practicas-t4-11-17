package Práctica11;

public class Práctica11 {

	public static void main(String[] args) {
		// En esta práctica vamos a trabajar con arrays.Se trata de crear un array de
		// enteros con 10 posiciones con los siguientes valores : 8, 33, 200,150, 11,88
		// , la posición 6 es igual a la posición [2] multiplicado por 2, la posición[7]
		// es igual a la posición [2] divido entre 10, la posición [8] es igual a la
		// posición[0] + la posición [1] + la posición [2]. Recorre el array y muestra
		// sus valores por pantalla.

		
		int[] num = new int[10];
		
		num[0] = 8;
		num[1] = 33;
		num[2] = 200;
		num[3] = 150;
		num[4] = 11;
		num[5] = 88;
		num[6] = num[2] * 10;
		num[7] = num[2] / 10;
		num[8] = num[0] + num[1] + num[2];
		num[9] = 0;
		
		System.out.println("El array num contiene los siguientes elementos: ");

		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
	}
}
			


