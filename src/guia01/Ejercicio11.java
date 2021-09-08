package guia01;

import java.util.Scanner;

public class Ejercicio11 {

    /* 11. La compañía de luz y sombras (CLS) requiere determinar el pago que debe
    realizar una persona por el consumo de energía eléctrica, la cual se mide en
    kilowatts (KW). Realice un diagrama de flujo y pseudocódigo que representen el
    algoritmo que permita determinar ese pago.
    */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double consumo, precioPorKW, pagoTotal;
        System.out.println("Ingrese consumo del mes de energía eléctrica en KiloWatts:");
        consumo = lector.nextDouble();
        System.out.println("Ingrese el precio por KW:");
        precioPorKW = lector.nextDouble();
        lector.close();
        pagoTotal = consumo * precioPorKW;
        System.out.printf("El pago total a realizar es de $%.2f\n", pagoTotal);

    }


}
