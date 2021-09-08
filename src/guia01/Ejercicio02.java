package guia01;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //	2. Una empresa importadora desea determinar cuántos dólares puede
        //	adquirir con equis cantidad de dinero mexicano. Realice un
        //	diagrama de flujo y pseudocódigo que representen el algoritmo para tal fin.

        float pesosMex, dolares, cotizacion;
        //cotizacion=0.050f;

        Scanner keyboard = new Scanner(System.in);

        System.out.println(" -----------CONVERSOR-----------");
        System.out.println(" ---Pesos Mexicanos a Dólares---");
        System.out.println("");
        System.out.println("Ingrese la cotizacion actual del dólar:");
        cotizacion=Float.parseFloat(keyboard.nextLine());
        System.out.println("Ingrese la cantidad de pesos mexicanos a convertir:");
        pesosMex=Float.parseFloat(keyboard.nextLine());
        keyboard.close();

        dolares = pesosMex / cotizacion;

        System.out.println("");
        System.out.println(" __________Resultado____________");
        System.out.println("	Mex$" + pesosMex + " -> US$" + dolares);
    }
}
