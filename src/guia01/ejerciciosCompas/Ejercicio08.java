package guia01.ejerciciosCompas;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        float distancia, velocidad, tiempoTotal;

        System.out.println("Ingrese la distancia en km a recorrer: ");
        distancia= lector.nextFloat();
        System.out.println("Ingrese la velocidad en km/h : ");
        velocidad= lector.nextFloat();
        lector.close();
        tiempoTotal =distancia/velocidad;
        System.out.printf("El tiempo total que tarda es de  %.2f hs", tiempoTotal);

    }
}

