package guia01;

import java.util.Scanner;

public class Ejercicio15 {
    /* 15. Se desea calcular la potencia eléctrica de circuito de la
    figura 1.6. Realice un diagrama de flujo y el pseudocódigo que
    representen el algoritmo para resolver el problema.
    Considere que: P = V*I y V = R*I.
    * */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double RESISTENCIA = 4;
        double voltaje, corriente;
        boolean bandera = true;
        int opcion;

        System.out.println("----Circuito Eléctrico----");
        System.out.printf("Dado un circuito eléctrico donde la Resistencia es %.2f Ohms\n",RESISTENCIA);
        while(bandera) {
            System.out.println("Ingrese una opción:");
            System.out.println("1- Calcular Potencia sabiendo Resistencia y Corriente");
            System.out.println("2- Calcular Potencia sabiendo Resistencia y Voltaje");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la Corriente en Amperes:");
                    corriente = lector.nextDouble();
                    voltaje = RESISTENCIA * corriente;
                    bandera = isBandera(voltaje, corriente);
                    break;
                case 2:
                    System.out.println("Ingrese el Voltaje en Volts:");
                    voltaje = lector.nextDouble();
                    corriente = voltaje / RESISTENCIA;
                    bandera = isBandera(voltaje, corriente);
                    break;
                default:
                    System.out.println("No ingreso una opción válida");
                    break;
            }
        }
        lector.close();
    }

    private static boolean isBandera(double voltaje, double corriente) {
        double potencia;
        boolean bandera;
        potencia = voltaje * corriente;
        System.out.printf("La Potencia del circuito es %.2fW", potencia);
        bandera=false;
        return bandera;
    }
}
