package guia02;

import java.util.Scanner;

public class Ejercicio03 {
    /*
        3.	El 14 de febrero una persona desea comprarle un regalo al ser querido
         que más aprecia en ese momento, su dilema radica en qué regalo puede hacerle,
          las alternativas que tiene son las siguientes:
        REGALO	        COSTO
        Tarjeta	        $10.00 o menos
        Chocolates	    $11.00 a $100.00
        Flores	        $101.00 a $250.00
        Anillo	        Más de $251.00

     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dinero con la que cuenta: ");
        float dineroEnBolsillo = lector.nextFloat();
        lector.close();
        String mensaje;
        if (dineroEnBolsillo > 250) {
            mensaje = "Usted puede comprarle un anillo a su ser querido";
        } else if (dineroEnBolsillo >= 101) {
            mensaje = "Usted puede comprarle unas flores a su ser querido";
        } else if (dineroEnBolsillo >= 11) {
            mensaje = "Usted puede comprarle unos chocolates a su ser querido";
        } else {
            mensaje = "Usted puede comprarle una tarjeta a su ser querido";
        }
        System.out.println(mensaje);
    }
}
