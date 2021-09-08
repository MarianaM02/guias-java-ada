package guia01;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        /*1. La compañía de autobuses “La curva loca” requiere determinar el costo
        que tendrá el boleto de un viaje sencillo, esto basado en los kilómetros por
        recorrer y en el costo por kilómetro. Realice un diagrama de flujo y pseudocódigo
        que representen el algoritmo para tal fin.*/

        double kmRecorridos, precioKm, precioBoleto;
        Scanner lector = new Scanner(System.in);

        System.out.println("--------BOLETERÍA--------");
        System.out.println("Ingrese la cantidad de km del viaje:");
        kmRecorridos = lector.nextDouble();
        System.out.println("Ingrese el precio por kilometro:");
        precioKm = lector.nextDouble();
        lector.close();
        precioBoleto = kmRecorridos * precioKm;

        //Output por consola con printf
        System.out.printf("El precio del Boleto es $%.2f para %.2f km.\n", precioBoleto, kmRecorridos);
        //Output por consola con println
        System.out.println("El precio del Boleto es $"+ String.format( "%.2f", precioBoleto) +
                " para "+ String.format( "%.2f", kmRecorridos) + " km.");
        //Output por consola con print
        System.out.print("El precio del Boleto es $"+ String.format( "%.2f", precioBoleto) +
                " para "+ String.format( "%.2f", kmRecorridos) + " km.\n");

    }

}
