package guia01.ejerciciosCompas;

import java.util.Scanner;

public class Ejercicio09 {
    /*
    9. Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en
    el tiempo que dura la llamada y en el costo por minuto. Realice un diagrama de flujo y
    pseudocódigo que representen el algoritmo para tal fin.
     */
    public static void main(String[] args) {
        float duracionLlamada, costoXMinuto, total;
        String nombre;
        Scanner lector = new Scanner(System.in);
        System.out.print("Hola, ¿Cuál es tu nombre?: ");
        nombre = lector.next();
        System.out.println(nombre+", ingrese los minutos que duró la llamada");
        duracionLlamada = lector.nextFloat();
        System.out.println(nombre+", ingrese el costo por minuto");
        costoXMinuto = lector.nextFloat();
        lector.close();
        total = duracionLlamada * costoXMinuto;
        System.out.println(nombre+", el costo de su llamada es de "+total);
    }

}
