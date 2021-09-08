package guia02;

import java.util.Scanner;

public class Ejercicio02 {
    /*
     2.Realice un algoritmo para determinar el sueldo semanal de un trabajador con base
     en las horas trabajadas y el pago por hora, considerando que después de las 40 horas
      cada hora se considera como excedente y se paga el doble.
     */
    public static void main(String[] args) {
        float sueldoSemanal;
        final byte JORNADA_LABORAL_SEMANAL = 40;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de horas trabajas: ");
        float horasTrabajadas = lector.nextFloat();
        System.out.println("Introduzca el valor de la hora: ");
        float valorHora = lector.nextFloat();
        lector.close();
        float horasExcedente;

        if (horasTrabajadas > JORNADA_LABORAL_SEMANAL) {
            horasExcedente = horasTrabajadas - JORNADA_LABORAL_SEMANAL;
            sueldoSemanal = (valorHora * JORNADA_LABORAL_SEMANAL) + (2 * horasExcedente * valorHora);
        } else {
            sueldoSemanal = valorHora * horasTrabajadas;
        }
        System.out.println("El sueldo semanal del trabajador es: " + sueldoSemanal);

    }
}
