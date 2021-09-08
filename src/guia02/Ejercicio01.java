package guia02;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        byte edad, edadMin;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la edad minima para votar en su pais:");
        edadMin = lector.nextByte();
        System.out.println("Ingrese su edad:");
        edad = lector.nextByte();
        lector.close();
        if (edad >= edadMin)
            System.out.println("Puedes votar");
        else
            System.out.println("No puedes votar");
    }
}
