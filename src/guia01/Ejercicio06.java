package guia01;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //6. Se requiere determinar la hipotenusa de un triángulo rectángulo.
        //¿Cómo sería el diagrama de flujo y el pseudocódigo que representen
        //el algoritmo para obtenerla?

        float cateto1, cateto2;
        double hipotenusa;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("---TRIANGULO RECTANGULO---");
        System.out.println();
        System.out.println("Ingrese Cateto 1:");
        cateto1 = keyboard.nextFloat();
        System.out.println("Ingrese Cateto 2:");
        cateto2 = keyboard.nextFloat();
        keyboard.close();

        hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

        System.out.println("");
        System.out.printf("Hipotenusa = %.4f", hipotenusa);
    }
}
