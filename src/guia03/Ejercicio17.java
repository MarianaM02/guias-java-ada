package guia03;

import java.util.Scanner;

/*
17.	Se tiene un arreglo de seis filas y ocho columnas y
se sabe que se tiene un elemento negativo. Realice un algoritmo
que indique la posici�n que ese elemento ocupa en el arreglo
(en la fila y la columna en la que se encuentra ese elemento).

 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int filas = 2;
        int columnas = 2;
        int fila2 = 0;
        int columna2 = 0;
        int[][] array = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Ingrese los numeros de la fila %d y la columna %d ", i, j);
                array[i][j] = input.nextInt();
                //Si algun numero del array es menor a 0, se guarda la posici�n:
                if (array[i][j] < 0) {
                    fila2 = i;
                    columna2 = j;
                }
            }
        }
        input.close();
        System.out.printf("La posici�n del n�mero negativo es: fila %d y columna %d ", fila2, columna2);

    }
}
