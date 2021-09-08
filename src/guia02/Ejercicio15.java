package guia02;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		/*
		 * 15. Realice un algoritmo que, con base en un n�mero proporcionado (1-7),
		 * indique el d�a de la semana que le corresponde (L-D). Represente el diagrama
		 * de flujo y el pseudoc�digo correspondiente.
		 */

		byte numero;
		String dia;

		Scanner lector = new Scanner(System.in);
		System.out.println("Proporcione un n�mero del 1 al 7");
		numero = lector.nextByte();
		lector.close();

		switch (numero) {
		case 1:
			dia = "lunes";
			break;
		case 2:
			dia = "martes";
			break;
		case 3:
			dia = "miercoles";
			break;
		case 4:
			dia = "jueves";
			break;
		case 5:
			dia = "viernes";
			break;
		case 6:
			dia = "sabado";
			break;
		default:
			dia = "domingo";
			break;

		}
		System.out.println("El dia de hoy es " + dia);
	}
}
