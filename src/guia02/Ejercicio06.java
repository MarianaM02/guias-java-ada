package guia02;

/* 6. Realice el diagrama de flujo y el pseudocódigo que muestren el algoritmo para
determinar el costo y el descuento que tendrá un artículo. Considere que si su precio es
mayor o igual a $200 se le aplica un descuento de 15%, y si su precio es mayor a $100
pero menor a $200, el descuento es de 12%, y si es menor a $100, sólo 10%.
*/

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        float precioDescuento;
        float descuento;
        System.out.println("Ingrese el precio del producto");
        Scanner lector = new Scanner(System.in);
        float costoProducto = lector.nextFloat();
        lector.close();

        if (costoProducto >= 200) {
            descuento = 0.15f;
        } else if (costoProducto >= 100) {
            descuento = 0.12f;
        } else {
            descuento = 0.10f;
        }
        precioDescuento = costoProducto - (costoProducto*descuento);
        System.out.println("El valor con descuento es " + precioDescuento + " pesos");



    }

}
