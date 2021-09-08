package guia02;

  /* Realice un algoritmo que permita determinar el sueldo semanal
   de un trabajador con base en las horas trabajadas y el pago por hora,
   considerando que a partir de la hora número 41 y hasta la 45, cada hora
   se le paga el doble, de la hora 46 a la 50, el triple, y que trabajar
   más de 50 horas no está permitido.
  */

import java.util.Scanner;

public class Ejercicio12_2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿ Cuantas Horas trabajo en la semana ? : ");
        float horasTrabajo = lector.nextFloat();
        System.out.println("¿ Cuantas es el pago por hora semanal trabajada? : ");
        float pagoHora = lector.nextFloat();
        lector.close();
        float pagoTotal=0;

        if (horasTrabajo >50 ){
            System.out.println("No  esta permitido tantas horas de trabajo");
        }else if (horasTrabajo >= 46){
            pagoTotal = (horasTrabajo - 40) * pagoHora * 3 + (40 * pagoHora);
            System.out.printf("El pago de %.2f es en  base a sus horas %f horas de trabajo"
                    ,pagoTotal,horasTrabajo);
        }else if (horasTrabajo <= 45 && horasTrabajo >= 41){
            pagoTotal = (horasTrabajo - 40) * pagoHora * 2 + (40 * pagoHora);
            System.out.printf("El pago de %.2f es en  base a sus  %f horas de trabajo"
                    ,pagoTotal,horasTrabajo);
        }else {
            pagoTotal = horasTrabajo * pagoHora;
            System.out.printf("El pago de %.2f es en  base a sus horas %f horas de trabajo"
                    ,pagoTotal,horasTrabajo);
        }
    }

}
