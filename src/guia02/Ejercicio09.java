package guia02;

import java.util.Scanner;

public class Ejercicio09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Una compa��a de seguros para autos ofrece dos tipos de p�liza: cobertura
		 * amplia (A) y da�os a terceros (B). Para el plan A, la cuota base es de
		 * $1,200, y para el B, de $950. A ambos planes se les carga 10% del costo si la
		 * persona que conduce tiene por hábito beber alcohol, 5% si utiliza lentes, 5%
		 * si padece alguna enfermedad como deficiencia cardiaca o diabetes, y si tiene
		 * m�s de 40 años, se le carga 20%, de lo contrario sólo 10%. Todos estos cargos
		 * se realizan sobre el costo base. Determinar cuánto le cuesta a una persona
		 * contratar una póliza.
		 */
		Scanner lector = new Scanner(System.in);

		final double COSTO_A = 1200, COSTO_B = 950;
		byte edad;
		String plan;
		boolean tomaAlcohol, usaLentes, tieneEnfermedad;
		double precioFinal = 0;

		System.out.println("----Póliza de Seguros----");
		System.out.println("\nQue plan utiliza?:");
		System.out.println("a - cobertura amplia");
		System.out.println("b - daños a terceros");
		plan = lector.nextLine();

		System.out.println("\nToma alcohol? (si/no)");
		// tomaAlcohol = lector.nextLine().toLowerCase().equals("si");
		tomaAlcohol = lector.nextLine().equalsIgnoreCase("si");
		System.out.println("\nUsa lentes? (si/no)");
		usaLentes = lector.nextLine().equalsIgnoreCase("si");
		System.out.println("\nPadece deficiencia cardiaca o diabetes? (si/no)");
		tieneEnfermedad = lector.nextLine().equalsIgnoreCase("si");
		System.out.println("\nCuantos años tiene?");
		edad = lector.nextByte();

		switch (plan.toLowerCase()) {
		case "a":
			precioFinal = calcularTotalPoliza(COSTO_A, tomaAlcohol, usaLentes, tieneEnfermedad, edad);
		case "b":
			precioFinal = calcularTotalPoliza(COSTO_B, tomaAlcohol, usaLentes, tieneEnfermedad, edad);
		default:
			System.out.println("Tipo de plan inválido");
		}
		if (precioFinal > 0) {
			System.out.printf("\nEl costo final de su póliza es $%.2f\n", precioFinal);
		}
	}

	private static double calcularTotalPoliza(double precioBase, boolean alcohol, boolean lentes, boolean enfermedad,
			byte edad) {
		double total;
		total = precioBase;
		if (alcohol)
			total += precioBase * 0.1;
		if (lentes)
			total += precioBase * 0.05;
		if (enfermedad)
			total += precioBase * 0.05;
		if (edad > 40)
			total += precioBase * 0.2;
		else
			total += precioBase * 0.1;
		return total;
	}
}
