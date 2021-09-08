package guia01;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        //	8. Se requiere determinar el tiempo que tarda una persona
        //	en llegar de una ciudad a otra en bicicleta, considerando
        //	que lleva una velocidad constante. Realice un diagrama de
        //	flujo y pseudocódigo que representen el algoritmo para tal fin.
        float total, km, velocidad;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("---BICICLETA---");
        System.out.println("");
        System.out.println("Ingrese la distancia en kilometros:");
        km = keyboard.nextFloat();
        System.out.println("Ingrese la velocidad en km/h:");
        velocidad = keyboard.nextFloat();
        keyboard.close();
        total = km/velocidad ;
        System.out.println("");
        System.out.println("Tiempo total estimado: "+ total + " horas");

    }
}
