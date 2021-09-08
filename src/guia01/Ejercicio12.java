package guia01;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //	12. Realice un diagrama de flujo y pseudocódigo que representen
        //	el algoritmo para determinar cuánto pagará finalmente una persona
        //	por un artículo equis, considerando que tiene un descuento de
        //	20%, y debe pagar 15% de IVA (debe mostrar el precio con
        //	descuento y el precio final).
        double total, precio, precioDesc;
        final double IVA, DESC;
        IVA = 0.15;
        DESC = 0.20;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("---PRECIO CON IVA---");
        System.out.println("\nIngrese el precio base:");
        precio = keyboard.nextFloat();
        keyboard.close();
        precioDesc = precio - precio * DESC;
        total = precioDesc + precioDesc * IVA;
        System.out.println("\nPrecio con Descuento: $" + precioDesc);
        System.out.println("Costo total con IVA: $" + total);

    }
}
