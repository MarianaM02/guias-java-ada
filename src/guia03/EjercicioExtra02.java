package guia03;
//2 - Crea un array bidimensional de números enteros y lo rellena con valores aleatorios dentro de un rango. Por ejemplo, generaArrayBiInt(8, 7, 10, 30) devolvería un array de 8 filas por 7 columnas relleno con números generados al azar comprendidos entre 10 y 30.

import java.util.Scanner;

public class EjercicioExtra02 {
    public static void main(String[] args) {
        int filas, columnas, minimo, maximo;
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas: ");
        filas = read.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        columnas = read.nextInt();
        System.out.println("Ingrese el número límite máximo: ");
        maximo = read.nextInt();
        System.out.println("Ingrese el número límite mínimo: ");
        minimo = read.nextInt();
        read.close();

        int matriz[][] = new int[filas][columnas];

        System.out.println("La matriz queda como: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            matriz[i][j] = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
                System.out.print("|" + matriz[i][j] + "|" );
            }
            System.out.println();
        }



    }
}
