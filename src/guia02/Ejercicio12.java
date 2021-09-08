package guia02;

import java.util.Scanner;
/* Realice un algoritmo que permita determinar el sueldo semanal
   de un trabajador con base en las horas trabajadas y el pago por hora,
   considerando que a partir de la hora número 41 y hasta la 45, cada hora se
   le paga el doble, de la hora 46 a la 50, el triple,
   y que trabajar más de 50 horas no está permitido.
   */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String mensaje;
        float pagoTotal;

        System.out.println("Indique horas trabajadas:");
        float horasTrabajadas = lector.nextFloat();
        System.out.println("¿Cual es el precio pagado por hora?:");
        float precioPorHora = lector.nextFloat();
        lector.close();

        if (horasTrabajadas > 50) {
            mensaje = "No esta permitido trabajar tantas horas";
        } else if (horasTrabajadas >=46){
            pagoTotal = (horasTrabajadas - 40) * precioPorHora *3 + (precioPorHora*40);
            mensaje = String.format("Su pago semanal es de $ %.2f en base a %.2f cantidad de horas"
                    ,pagoTotal, horasTrabajadas);
        } else if (horasTrabajadas >= 41 && horasTrabajadas <=45) {
            pagoTotal = (horasTrabajadas - 40) * precioPorHora *2 + (precioPorHora*40);
            mensaje = String.format("Su pago semanal es de $ %.2f en base a %.2f cantidad de horas"
                    ,pagoTotal, horasTrabajadas);
        }else{
            pagoTotal = horasTrabajadas * precioPorHora;
            mensaje = String.format("Su pago semanal es de $ %.2f en base a %.2f cantidad de horas"
                    ,pagoTotal, horasTrabajadas);
        }
        System.out.println(mensaje);

    }
}
