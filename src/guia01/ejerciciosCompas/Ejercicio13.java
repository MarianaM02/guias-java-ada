package guia01.ejerciciosCompas;

import java.util.Scanner;

/*
13. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
determinar cuánto dinero ahorra una persona en un año si considera que cada semana
ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el
sueldo).
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        double sueldo, porcentajeSemanal, totalAhorrado;
        double semanasDelAnio = 48;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hola, ingresa tu sueldo mensual:");
        sueldo = sc.nextDouble();
        sc.close();
        porcentajeSemanal = (sueldo/4) * 0.15;
        totalAhorrado = porcentajeSemanal * semanasDelAnio;
        System.out.println("El total ahorrado en el año es de: "+totalAhorrado);
    }
}
