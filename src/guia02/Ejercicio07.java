package guia02;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
//        7. El presidente de la república ha decidido estimular a todos los
//        estudiantes de una universidad mediante la asignación de becas mensuales,
//        para esto se tomarán en consideración los siguientes criterios:

//        Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de $2000.00;
//        con promedio mayor o igual a 7.5, de $1000.00;
//        para los promedios menores de 7.5 pero mayores o iguales a 6.0, de $500.00;
//        a los demás se les enviará una carta de invitación incitándolos a que estudien más
//        en el próximo ciclo escolar.

//        A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a 9, se les dará $3000;
//        con promedios menores a 9 pero mayores o iguales a 8, $2000;
//        para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dará $100,
//        y a los alumnos que tengan promedios menores a 6 se les enviará carta de invitación.
        float beca;

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        byte edad = lector.nextByte();
        System.out.println("Ingrese promedio mensual:");
        float promedio = lector.nextFloat();
        lector.close();

        if (edad > 18) {
            if (promedio >= 9) {
                beca = 2000;
            } else if (promedio >= 7.5) {
                beca = 1000;
            } else if (promedio >= 6) {
                beca = 500;
            } else {
                beca = 0;
            }
        } else {
            if (promedio >= 9) {
                beca = 3000;
            } else if (promedio >= 8) {
                beca = 2000;
            } else if (promedio >= 6) {
                beca = 100;
            } else {
                beca = 0;
            }
        }

        if (beca == 0){
            System.out.println("Usted no obtuvo la beca. Estudie más en el próximo ciclo escolar.");
        }else{
            System.out.printf("Por tu promedio de %.2f, obtuviste una beca de $%.2f", promedio, beca);
        }


    }
}
