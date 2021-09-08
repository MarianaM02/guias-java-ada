package guia01.ejerciciosCompas;
import java.util.*;

public class Ejercicio12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Realice un diagrama de flujo y pseudoc�digo que representen 
		 * el algoritmo para determinar cu�nto pagar� finalmente una 
		 * persona por un art�culo equis, considerando que tiene un 
		 * descuento de 20%, y debe pagar 15% de IVA (debe mostrar el 
		 * precio con descuento y el precio final).
		 */

		Scanner lector = new Scanner (System.in);
		
		double valorProd, IVA, descuento, valorIVA, valorDesc;
		
		System.out.println("�Bienvenido! Ingrese el valor de su producto: ");
		valorProd = lector.nextDouble();
		
		IVA = 0.15;
		descuento = 0.20;
		valorIVA = valorProd + (valorProd * IVA);
		valorDesc = valorIVA - (valorIVA * descuento);
		
		System.out.println( "El valor total de su producto es: $" + valorIVA);
		System.out.println( "El valor con descuento de su producto es: $" + valorDesc + ". Muchas gracias.");

		
		
		
	}

}
