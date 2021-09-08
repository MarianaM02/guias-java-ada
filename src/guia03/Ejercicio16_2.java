package guia03;

import java.util.Scanner;

/*
Una compañía de transporte cuenta con cinco choferes, de los cuales se conoce: nombre,
horas trabajadas cada día de la semana (seis días) y sueldo por hora. Realice un algoritmo que:
-Calcule el total de horas trabajadas a la semana para cada trabajador.
-Calcule el sueldo semanal para cada uno de ellos.
-Calcule el total que pagará la empresa.
-Indique el nombre del trabajador que labora más horas el día lunes.
-Imprima un reporte con todos los datos anteriores.
 */
public class Ejercicio16_2 {
	public static void main(String[] args) {
		String[] diasDescripcion = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" };
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de trabajadores para la cual desea el cálculo:");
		int cantTrabajadores = escaner.nextInt();
		int[] totalHorasTrabajadas = new int[cantTrabajadores];
		escaner.nextLine();
		final int LUNES = 0;
		String[] nombres = new String[cantTrabajadores];
		int[][] horasTrabajadasPorCadaDia = new int[cantTrabajadores][6];
		float[] sueldoPorHora = new float[cantTrabajadores];

		for (int trabajador = 0; trabajador < cantTrabajadores; trabajador++) {
			System.out.printf("Introduzca el nombre del trabajador %d:", trabajador + 1);
			nombres[trabajador] = escaner.nextLine();

			for (int dias = 0; dias < diasDescripcion.length; dias++) {
				System.out.printf("Introduzca la cantidad de horas que trabajó el día %s: ", diasDescripcion[dias]);
				horasTrabajadasPorCadaDia[trabajador][dias] = escaner.nextInt();
				totalHorasTrabajadas[trabajador] += horasTrabajadasPorCadaDia[trabajador][dias];
			}
			System.out.printf("Introduzca el sueldo por hora del trabajador %d:", trabajador + 1);
			sueldoPorHora[trabajador] = escaner.nextFloat();
			escaner.nextLine();
		}
		escaner.close();
		int mayorCantHorasLunes = 0;
		String nombreMasTrabajadorLunes = "";
		for (int trabajador = 0; trabajador < cantTrabajadores; trabajador++) {
			if (mayorCantHorasLunes < horasTrabajadasPorCadaDia[trabajador][LUNES]) {
				mayorCantHorasLunes = horasTrabajadasPorCadaDia[trabajador][LUNES];
				nombreMasTrabajadorLunes = nombres[trabajador];
			}
		}
	}

}
