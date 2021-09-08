package guia03;

import java.util.Scanner;

/*14.	Realice un algoritmo que lea una matriz de N filas y M columnas
y que cuente los elementos negativos que contiene, así como también cuántos
elementos de la diagonal principal son igual a cero.
*/

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner tabla = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas y columnas de la matriz");
        int n = tabla.nextInt();
        int contador = 0;
        int suma = 0;
        int matriz[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Introduzca el valor de la fila " + i + " y columna " + j);
                matriz[i][j] = tabla.nextInt();
                if (matriz[i][j] < 0) {
                    contador++;
                }
                if (i == j && matriz[i][j] == 0) {
                    suma++;
                }
            }
        }
        tabla.close();
        System.out.println("La cantidad de ceros en la diagonal principal es: " + suma);
        System.out.println("La cantidad de elementos negativos de la matriz es: " + contador);
    }
}