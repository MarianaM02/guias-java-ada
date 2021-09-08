package guia03;

import java.util.Scanner;

public class Ejercicio02 {
       /*
        Realice el producto de dos matrices de orden M x N y P x Q.
       */

        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            System.out.println("***** ATENCION Recuerda que el número de columnas de la " +
                    "primera matriz debe ser igual al número de filas de la segunda.****");
            System.out.println("Introduzca que cantidad de filas tiene su matriz1: ");
            int fila1 = lector.nextInt();
            System.out.println("Introduzca que cantidad de columnas tiene su matriz1: ");
            int columna1 = lector.nextInt();

            System.out.println("Introduzca que cantidad de filas tiene su matriz2: ");
            int fila2 = lector.nextInt();
            System.out.println("Introduzca que cantidad de columnas tiene su matriz2: ");
            int columna2 = lector.nextInt();
            lector.close();

            int matriz1[][] = new int[fila1][columna1];
            int matriz2[][] = new int[fila2][columna2];
            int matrizR[][] = new int[matriz1.length][matriz2[0].length];

            if (matriz1[0].length == matriz2.length){

                for (int i = 0; i < fila1; i++) {
                    for (int j = 0; j < columna1; j++) {
                    System.out.println("Introduzca el valor de la fila1" + i + "columna1" + j);
                    matriz1[i][j] = lector.nextInt();
                }
            }
            for (int i = 0; i < fila2; i++) {
                    for (int j = 0; j < columna2; j++) {
                        System.out.println("Introduzca el valor de la fila2  " + i + " columna2  " + j);
                        matriz2[i][j] = lector.nextInt();
                    }
            }
                System.out.println("Matriz 1: ");
            for (int i = 0; i < fila1; i++) {
                for (int j = 0; j < columna1; j++) {
                    System.out.print(matriz1[i][j]  +  " ");
                }
                System.out.println("");
            }

                System.out.println("Matriz 2:");
            for (int i = 0; i < fila2; i++) {
                for (int j = 0; j < columna2; j++) {
                    System.out.print(matriz2[i][j] +  " ");
                }
                System.out.println("");
            }
            // MULTIPLICACIÓN
                System.out.println("El producto de  2 matrices es  :");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < matriz1[0].length; k++) {
                        matrizR[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                    System.out.print(matrizR[i][j] +  " ");
                   }
                System.out.println("");
               }
            } else{
                System.out.println(" La matriz no se puede multiplicar");

            }
        }
}
