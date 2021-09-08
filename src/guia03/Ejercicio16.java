package guia03;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
//16. Una compañía de transporte cuenta con cinco choferes, de los cuales se
//conoce: nombre, horas trabajadas cada día de la semana (seis días) y sueldo por hora.
//Realice un algoritmo que:
		// a.Calcule el total de horas trabajadas a la semana para cada trabajador.
		// b.Calcule el sueldo semanal para cada uno de ellos.
		// c.Calcule el total que pagará la empresa.
		// d.Indique el nombre del trabajador que labora más horas el día lunes.
		// e.Imprima un reporte con todos los datos anteriores.
		Scanner lector = new Scanner(System.in);
		final int CANT_TRABAJADORES = 5;
		final int LUNES = 0;
		String[] nombreChofer = new String[CANT_TRABAJADORES];
		int[][] horasTrabajadasDia = new int[CANT_TRABAJADORES][6];
		double[] sueldoHora = new double[CANT_TRABAJADORES];
		int[] totalHorasTrabajadasSemana = new int[CANT_TRABAJADORES];
		double[] sueldoSemanal = new double[CANT_TRABAJADORES];

		// Ingreso de arreglos y matriz (datos conocidos)
		for (int i = 0; i < CANT_TRABAJADORES; i++) {
			System.out.println("	CHOFER " + (i + 1));
			System.out.println("--------------------------");
			System.out.println("Ingrese el nombre:");
			nombreChofer[i] = lector.nextLine();
			System.out.println("Ingrese su sueldo (por hora):");
			sueldoHora[i] = lector.nextDouble();
			for (int j = 0; j < 6; j++) {
				System.out.println("Ingrese las horas trabajadas el dia " + (j + 1) + ":");
				horasTrabajadasDia[i][j] = lector.nextInt();
			}
			lector.nextLine();
		}
		lector.close();

		// a. Total de horas trabajadas por Chofer
		for (int i = 0; i < CANT_TRABAJADORES; i++) {
			totalHorasTrabajadasSemana[i] = 0;
			for (int j = 0; j < 6; j++) {
				totalHorasTrabajadasSemana[i] += horasTrabajadasDia[i][j];
			}
		}

		// b. Sueldo semanal por Chofer
		for (int i = 0; i < CANT_TRABAJADORES; i++) {
			sueldoSemanal[i] = totalHorasTrabajadasSemana[i] * sueldoHora[i];
		}

		// c. Total que paga la empresa
		double totalSueldos = 0;
		for (int i = 0; i < CANT_TRABAJADORES; i++) {
			totalSueldos += sueldoSemanal[i];
		}

		// d. Chofer que mas horas trabaja los lunes (lunes==primer dia de la
		// semana==[i,0])
		// toma el primer chofer con el numero mas alto, no considera repeticiones
		int idChoferMaxHorasLunes = 0;
		for (int i = 0; i < CANT_TRABAJADORES; i++) {
			if (horasTrabajadasDia[i][LUNES] > horasTrabajadasDia[idChoferMaxHorasLunes][LUNES]) {
				idChoferMaxHorasLunes = i;
			}
		}

		// e. Impresion de los datos por patalla
		System.out.println("	CHOFERES ");
		System.out.println("--------------------------");
		for (int i = 0; i < CANT_TRABAJADORES; i++) {
			System.out.println("id: 	" + (i + 1));
			System.out.println("Nombre: 	" + nombreChofer[i]);
			System.out.println("Total Trabajado en la Semana: 	" + totalHorasTrabajadasSemana[i] + "hs");
			System.out.println("Sueldo Semanal: 	$" + sueldoSemanal[i]);
		}

		System.out.println("	SUELDOS ");
		System.out.println("--------------------------");
		System.out.println("Total a pagar: $" + totalSueldos);
		System.out.println("	CHOFER DESTACADO ");
		System.out.println("--------------------------");
		System.out.println("Emplead@ que trabajo más horas el lunes: " + nombreChofer[idChoferMaxHorasLunes]);

	}
}
