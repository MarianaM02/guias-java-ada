package guia02;
import java.util.*;
public class Ejercicio04 {
    public static void main(String[] args) {
        /*El due�o de un estacionamiento requiere un diagrama de flujo con el
        algoritmo que le permita determinar cu�nto debe cobrar por el uso del
        estacionamiento a sus clientes. Las tarifas que se tienen son las siguientes:
        a.	Las dos primeras horas a $5.00 c/u.
                b.	Las siguientes tres a $4.00 c/u.
                c.	Las cinco siguientes a $3.00 c/u.
                d.	Despu�s de diez horas el costo por cada una es de dos pesos.
         */

        Scanner lector = new Scanner (System.in);
        System.out.println("�Cuantas horas estuvo estacionado?: ");
        float horas = lector.nextFloat();
        lector.close();
        float precioTotal;
        final float DIEZ_HORAS = 2, CINCO_HORAS = 3, TRES_HORAS = 4, DOS_HORAS = 5;


        if (horas <= 2) {
            precioTotal = horas * DOS_HORAS;
        } else if (horas >=3 && horas <= 5) {
            precioTotal = ((horas - 2)* TRES_HORAS) + (2 * DOS_HORAS);
        } else if (horas >=6 && horas <= 10) {
            precioTotal = ((horas - 5) * CINCO_HORAS) + (3 * TRES_HORAS) + (2 * DOS_HORAS);
        } else {
            precioTotal = ((horas - 10) * DIEZ_HORAS) + (5 * CINCO_HORAS) + (3 * TRES_HORAS) + (2 * DOS_HORAS);
        }

        System.out.println("El total a cobrar es de: $" + precioTotal);

    }
}
