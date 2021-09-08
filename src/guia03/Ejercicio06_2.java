package guia03;

import java.util.Scanner;

/*
un algoritmo que lea los nombres y las edades de diez alumnos, y que los datos se almacenen en
dos vectores, y con base en esto se determine el nombre del alumno con la edad mayor del arreglo.
 */
public class Ejercicio06_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alumno[] = new String[10];
        int edad[] = new int[10];
        for (int i = 0; i < alumno.length ; i++) {
            System.out.println("Ingrese el nombre del alumno número "+ (i+1));
            alumno[i] = sc.next();
            System.out.println("Ingrese la edad del alumno número "+ (i+1));
            edad[i] = sc.nextByte();
        }
        sc.close();
        int edadMayor = 0;
        int index=0;
        for(int i = 0; i <edad.length; i++){
            if(edad[i]>edadMayor){
                edadMayor=edad[i];
                index = i;
            }

        }
        System.out.println("La persona de mayor edad es " +alumno[index]);
    }
}

