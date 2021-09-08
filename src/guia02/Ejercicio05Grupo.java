package guia02;

import java.util.Scanner;

public class Ejercicio05Grupo {
    /* Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la
     persona de menor edad.
*/
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre1 = dato.nextLine();
        System.out.println("Ingrese su edad: ");
        byte edad1 = dato.nextByte();
        dato.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre2 = dato.nextLine();
        System.out.println("Ingrese su edad: ");
        byte edad2 = dato.nextByte();
        dato.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre3 = dato.nextLine();
        System.out.println("Ingrese su edad: ");
        byte edad3 = dato.nextByte();
        dato.close();

        if (edad1 < edad2 && edad1 < edad3 ) {
         System.out.println("La persona de menor edad es: " + nombre1 + edad1 + " " + "años");
        } else if (edad2 < edad3) {
         System.out.println("La persona de menor edad es: " + nombre2 + edad2 +  " " + "años");
        }
        else {
        System.out.println("La persona de menor edad es: " + nombre3 + edad3 +  " " + "años");
        }

    }
}
