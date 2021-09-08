package guia01.ejerciciosCompas;
import java.util.*;
public class Ejercicio18 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Se requiere un algoritmo para determinar 
		 * el costo que tendr� realizar una llamada 
		 * telef�nica con base en el tiempo que dura 
		 * la llamada y en el costo por minuto. 
		 * Represente la soluci�n mediante el diagrama de flujo y pseudoc�digo.
		 */

		Scanner lector = new Scanner(System.in);
		
		double minutos, precioPorMinuto = 1.50, precioTotal;
		
		System.out.println("�Cu�ntos minutos dur� su conversaci�n?");
		minutos = lector.nextDouble();
		
		precioTotal = precioPorMinuto * minutos;
		
		System.out.println("El precio de su llamada es de $" + precioTotal + " �Gracias!");
		
		
		
		
		

	}

}
