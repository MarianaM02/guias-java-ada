package guia03;

/*
Ejercicio 19 matriz de 5 por 5 elementos.
20- Realice un algoritmo que a partir de la matriz del problema anterior encuentre cuántos elementos tienen valor par
y cuántos valores impares.
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int matriz [][] = new int [5][5];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Ingrese el valor del indice [%d,%d]: \n", i, j);
                matriz[i][j] = datos.nextInt();

                if ( matriz[i][j] % 2 == 0) {
                    par ++;
                } else {
                   impar ++;
                }
            }
        }
        datos.close();
        System.out.printf("Los indices pares son: %d y los indices impares son: %d",par, impar);
    }
}
