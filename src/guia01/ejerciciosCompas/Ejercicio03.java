package guia01.ejerciciosCompas;
/* Una empresa que contrata personal requiere determinar la edad de las personas que
solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en
que nacieron. Realice el diagrama de flujo y pseudocódigo que representen el algoritmo
para solucionar este problema.
 */

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("****Ejercicio 3****");
     int anioNacimiento, anioActual, edadEmpleado;
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el anio de nacimiento del empleado: ");
        anioNacimiento = lector.nextInt();
        System.out.println("Indique el anio actual: ");
        anioActual = lector.nextInt();
        lector.close();
        edadEmpleado = anioActual - anioNacimiento;
        System.out.println("La edad del empleado es: " + edadEmpleado + " años");

    }
}
