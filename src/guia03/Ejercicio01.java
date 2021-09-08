package guia03;

import java.util.Scanner;

public class Ejercicio01 {

        public static void main(String[] args) {
            Scanner lector= new Scanner(System.in);

            int fila = 0;
            int columna = 0;
            System.out.println("Ingrese la cantidad de filas:");
            fila = lector.nextInt();
            System.out.println("Ingrese la cantidad de columnas:");
            columna = lector.nextInt();
            int[][] numerosEnteros = new int[fila][columna];

            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.printf("Ingrese el valor de la cordenada [%d , %d]: ", i, j);
                    numerosEnteros[i][j] = lector.nextInt();

                }

            }
            lector.close();

            for (int i = 0; i <fila ;i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.print(numerosEnteros[i][j] + "\t");


                }
                System.out.println();
            }
        }
    }

