package guia03;

import java.util.Scanner;

/* 7.	Realice un algoritmo que lea un vector y a partir de él forme un segundo vector,
de tal forma que el primer elemento pase a ser el segundo, el segundo pase a ser el tercero,
el último pase a ser el primero, y así sucesivamente. Represéntelo mediante un diagrama de
 */

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del vector:");
        int n = lector.nextInt();
        int primerVector[] = new int[n];
        int segundoVector[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca los elementos del vector");
            primerVector[i] = lector.nextInt();

            if ( i == n-1){
                segundoVector[0] = primerVector[i];

            } else {
                segundoVector[i+1] = primerVector[i];
            }
        }
        lector.close();
        for (int i = 0; i < n; i++) {
            System.out.print("|" + segundoVector[i] + "|");

        }
    }
}

