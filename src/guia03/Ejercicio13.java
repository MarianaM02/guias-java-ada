package guia03;
 /*Realice un algoritmo que lea un vector de cien elementos y que calcule
 su magnitud y represéntelo mediante diagrama de flujo y pseudocódigo.
  */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double magnitud;
        int vector[] = new int[100];
        double suma = 0;
        for (int i = 0; i < 100; i++) {
                System.out.println("Ingrese los elementos del vector: ");
                vector[i] = datos.nextInt();

            suma = suma + Math.pow(vector[i],2);
        }
        datos.close();
        magnitud = Math.sqrt(suma);
        System.out.println("La magnitud del vector es: "+ magnitud);

    }
}