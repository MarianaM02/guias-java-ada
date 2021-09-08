package guia02;

import java.util.Scanner;

public class Ejercicio21 {
    /*21.	El banco “Bandido de peluche” desea calcular para uno de sus clientes el saldo actual,
     el pago mínimo y el pago para no generar intereses. Los datos que se conocen son:
     -saldo anterior del cliente,
     -monto de las compras que realizó y
     -el pago que depositó en el corte anterior.
     Para calcular el pago mínimo se debe considerar 15% del saldo actual,
     y para no generar intereses corresponde 85% del saldo actual, considerando que este saldo debe incluir 12%
     de los intereses causados por no realizar el pago mínimo y $200 por multa por el mismo motivo.
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
    double pagoMinimoAnterior, interesAcumulado = 0, multaPorPagoMenorAlMinimo, saldoAnterior,
            saldoActual, pagoMinimoActual, pagoParaNoGenerarInteres, montoCompras, pagoAnterior;

        System.out.println("Introduzca el valor del saldo anterior del cliente: ");
        saldoAnterior=lector.nextDouble();
        System.out.println("Introduza el monto total de las compras que realizó en este mes: ");
        montoCompras=lector.nextDouble();
        System.out.println("Introduzca el valor del pago que realizó en el corte anterior: ");
        pagoAnterior= lector.nextDouble();
        lector.close();
        //Calculo del pago mínimo del cliente:
        pagoMinimoAnterior= saldoAnterior * 0.15;
        if (pagoAnterior > pagoMinimoAnterior) {
            multaPorPagoMenorAlMinimo=0;
        }else {
            interesAcumulado=saldoAnterior*0.12;
            multaPorPagoMenorAlMinimo=200;
        }
        saldoActual=saldoAnterior + montoCompras + interesAcumulado + multaPorPagoMenorAlMinimo - pagoAnterior;
        pagoMinimoActual = saldoActual * 0.15;
        pagoParaNoGenerarInteres= saldoActual * 0.85;
        System.out.println("Valor de pago mínimo: $" + pagoMinimoActual);
        System.out.println("Valor de pago para no generar intereses: $" + pagoParaNoGenerarInteres);
        System.out.println("Valor del saldo actual: $" + saldoActual);





    }
}
