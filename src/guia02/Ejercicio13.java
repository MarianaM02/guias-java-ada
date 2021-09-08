package guia02;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*Los alumnos de una escuela desean realizar un viaje de estudios,
         pero requieren determinar cu�nto les costar� el pasaje,
         considerando que las tarifas del autob�s son las siguientes:
         si son m�s de 100 alumnos, el costo es de $20; si son entre 50 y 100, $35;
          entre 20 y 49, $40, y si son menos de 20 alumnos, $70 por cada uno.
          Realice el algoritmo para determinar el costo del pasaje de cada alumno.
         */

        Scanner lector = new Scanner(System.in);

        int cantAlumnos, precio;

        System.out.println("�Cuantos alumnos van a ir al viaje?");
        cantAlumnos = lector.nextInt();
        lector.close();

        if (cantAlumnos > 100) {
            precio = 20;
        } else if (cantAlumnos >=50) {
            precio = 35;
        } else if (cantAlumnos >=20) {
            precio = 40;
        } else {
            precio = 70;
        }
        System.out.println("El precio por cada alumno es: $" + precio);
        System.out.println("El precio total del viaje es  $" + (cantAlumnos*precio));
    }
}
