package guia03;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioFila {
	public static void main(String[] args) {
		/*
		 * Devuelve una fila (array unidimensional) de un array bidimensional que se
		 * pasa como parámetro.
		 */

		Scanner teclado = new Scanner(System.in);
		// int fila=0,columnas=0;

		System.out.println("Ingrese la cantidad de filas ");
		int fila = teclado.nextInt(); // 3

		System.out.println("Ingrese la cantidad de columnas");
		int columnas = teclado.nextInt(); // 5

		int[][] matriz = new int[fila][columnas];

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = (int) (Math.random() * 51 + 1);
			}
		}

		System.out.printf("Numero de fila que quiere mostrar (menor a %d): \n", fila);
		int filaElegida = teclado.nextInt(); // 2
		teclado.close();

		int[] arregloAux = new int[columnas];
		for (int i = 0; i < arregloAux.length; i++) {
			arregloAux[i] = matriz[filaElegida][i];
		}

		// Mostramos la Matriz
		System.out.println("**********************************");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.printf("%3d ", matriz[i][j]);
			}
			System.out.println();
		}

		// Mostramos el vector
		System.out.println("**********************************");
		System.out.println(Arrays.toString(arregloAux));
		System.out.println();

	}
}
