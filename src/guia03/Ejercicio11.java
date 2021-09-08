package guia03;

import java.util.Scanner;

/*
Se tiene una matriz de 12 filas por 19 columnas y se desea un algoritmo para encontrar todos sus elementos
negativos y para que les cambie ese valor negativo por un cero.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int fila = 3, col = 4;
        Scanner lector = new Scanner(System.in);
        int[][] matrizA = new int[fila][col];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("ingrese los valores de la matriz A fila %d columna %d:", i, j);
                matrizA[i][j] = lector.nextInt();
            }
        }
        lector.close();
        System.out.println("El resultado de la matriz es : ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                if (matrizA[i][j] < 0) {
                    matrizA[i][j] = 0;
                }
            }
        }
        for (int i= 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print( matrizA[i][j]+"");
            }
            System.out.print("\n");
        }
    }
}
