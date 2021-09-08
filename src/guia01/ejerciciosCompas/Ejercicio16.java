package guia01.ejerciciosCompas;
import java.util.*;
public class Ejercicio16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Realice el diagrama de flujo y pseudoc�digo 
		 * que representen el algoritmo para encontrar 
		 * el �rea de un cuadrado.
		 */

		Scanner lector = new Scanner (System.in);
		
		double base, altura, area;
		
		System.out.print("Introduzca la base del cuadrado: ");
		base = lector.nextDouble();
		
		System.out.println("Ahora introduzca la altura: ");
		altura = lector.nextDouble();
		
		area = base * altura;
		
		System.out.print("El �rea de su cuadrado es: " + area + " m2.");
		
		

	}

}
