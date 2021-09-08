package guia03;

/* Se tiene en un arreglo cien elementos representando
 calificaciones de los estudiantes de una escuela.
 Realice un algoritmo que lea el arreglo y calcule la calificación promedio
  del grupo, además, que cuente los estudiantes que obtuvieron calificaciones
  arriba del promedio del grupo.
*/

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int calificaciones[] = new int[10];
		float promedio = 0;
		float suma = 0;
		float suma2 = 0;

		System.out.println("Ingresa la cantidad de alumnos");
		int cantidad = lector.nextInt();
		for (int i = 0; i < cantidad; i++) {
			System.out.println(" Ingresa las calificaciones del Alumno:" + i);
			calificaciones[i] = lector.nextInt();
			suma += calificaciones[i];
			promedio = (suma / cantidad);
		}
		lector.close();
		for (int i = 0; i < cantidad; i++) {
			System.out.print("alumno " + i + "=");
			System.out.println("[" + calificaciones[i] + "]");
		}
		System.out.println("");

		System.out.println("El promedio del GRUPO ES  : ");
		for (float i = 0; i < calificaciones.length; i++) {
		}
		System.out.println(promedio);
		System.out.println("");

		System.out.println("El numero de alumnos con el promedio mas alto es : ");
		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i] > promedio) {
				suma2++;
			}
		}
		System.out.print(suma2);
	}
}
