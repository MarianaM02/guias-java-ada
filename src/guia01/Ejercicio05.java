package guia01;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        //	5. Pinturas "La brocha gorda" requiere determinar
        //	cuánto cobrar por trabajos de pintura. Considere
        //	que se cobra por m2 y realice un diagrama de flujo
        //	y pseudocódigo que representen el algoritmo que le
        //	permita ir generando presupuestos para cada cliente.

        float tarifa, metros, total;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" ---PRESUPUESTO PINTURA---");
        System.out.println("");
        System.out.println( "Ingrese la cantidad de m2 a pintar:");
        metros = keyboard.nextFloat();
        System.out.println( "Ingrese el precio por metro:");
        tarifa = keyboard.nextFloat();
        keyboard.close();
        total = metros * tarifa;
        System.out.println("");
        System.out.println("TOTAL: $"+ total);
    }
}
