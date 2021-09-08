package guia02;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        //16. El secretario de educación ha decidido otorgar un bono por
        //desempeño a todos los profesores con base en la puntuación siguiente:
        //Realice un algoritmo que permita determinar el monto de bono que
        // percibirá un profesor (debe capturar el valor del salario mínimo
        // y los puntos del profesor).
        /* Puntos	        Premio
        0 - 100             1 salario
        101 - 150           2 salarios mínimos
        151 - en adelante	3 salarios mínimos */

        float bono;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese cantidad de puntos:");
        int puntos = lector.nextInt();
        System.out.println("Ingrese salario mínimo:");
        float salario = lector.nextFloat();
        lector.close();

        if (puntos >= 151){
            bono = salario * 3;
        } else if (puntos >= 101) {
            bono = salario * 2;
        } else if (puntos >= 0){
            bono = salario;
        } else {
            bono = 0;
        }

        if (bono == 0){
            System.out.println("Puntos ingresados no válidos");
        } else {
            System.out.printf("El bono que recibirá será de $%.2f", bono);
        }
    }
}
