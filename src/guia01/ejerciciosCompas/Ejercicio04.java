package guia01.ejerciciosCompas;

/*
Un estacionamiento requiere determinar el cobro que debe aplicar a las personas
que lo utilizan.Considere que el cobro es con base a las horas que lo disponen y
que las fracciones de hora se toman como completas.

 */

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("****Ejercicio 4****");
        Scanner lector=new Scanner(System.in);
        double tarifaHora, cantHoras, totalApagar;

        System.out.println("Introduzca cantidad de horas utilizadas : " );
        cantHoras = lector.nextDouble();

        cantHoras = Math.ceil(cantHoras);

        System.out.println("Ingrese tarifa por hora :");
        tarifaHora = lector.nextDouble();
        lector.close();
        totalApagar = tarifaHora*cantHoras;
        System.out.println("El total a pagar por la cantidad de horas es: " +totalApagar);





    }
}
