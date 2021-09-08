package guia02;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		// 14. Realice un algoritmo que, con base en una calificación proporcionada
		// (0-10), indique con letra la calificación que le corresponde: 10 es
		// “A”, 9 es “B”, 8 es “C”, 7 y 6 son “D”, y de 5 a 0 son “F”.

		char letra;
		Scanner lector = new Scanner(System.in);

		System.out.println("Ingrese su nota numérica: ");
		byte nota = lector.nextByte();
		lector.close();

		// Resolución con IF
		/*
		 * if(nota == 10){ letra='A'; }else if(nota == 9){ letra='B'; }else if (nota ==
		 * 8){ letra='C'; }else if (nota == 7 || nota == 6){ letra='D'; }else {
		 * letra='F'; }
		 */

		// Resolución con SWITCH
		switch (nota) {
		case 10:
			letra = 'A';
			break;
		case 9:
			letra = 'B';
			break;
		case 8:
			letra = 'C';
			break;
		case 7:
		case 6:
			letra = 'D';
			break;
		default:
			letra = 'F';
			break;
		}

		// Resolución con SWITCH MEJORADO
		/*
		 * letra = switch (nota) { case 10 -> 'A'; case 9 -> 'B'; case 8 -> 'C'; case 7,
		 * 6 -> 'D'; default -> 'F'; };
		 */

		System.out.println("Tu calificación es " + letra);

	}

}
