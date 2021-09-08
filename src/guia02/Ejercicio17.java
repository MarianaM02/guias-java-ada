package guia02;

import java.util.Scanner ;

public class Ejercicio17 {
    /*17.Realice un algoritmo y represéntelo mediante el diagrama de flujo, el pseudocódigo y el diagrama N/S que
     permitan determinar qué paquete se puede comprar una persona con el dinero que recibirá en diciembre, considerando
      lo siguiente:
    Paquete A. Si recibe $50,000 o más se comprará una televisión, un modular, tres pares de zapatos, cinco camisas
    y cinco pantalones.
    Paquete B. Si recibe menos de $50,000 pero más (o igual) de $20,000, se comprará una grabadora, tres pares de zapatos,
    cinco camisas y cinco pantalones.
    Paquete C. Si recibe menos de $20,000 pero más (o igual) de $10,000, se comprará dos pares de zapatos, tres camisas
     y tres pantalones.
    Paquete D. Si recibe menos de $10,000, se tendrá que conformar con un par de zapatos, dos camisas y dos pantalones.*/

    public static void main(String[] args) {

        final String PAQUETE_A = "se podrá comprar una televisión, un modular, tres pares de zapatos, cinco camisas y cinco pantalones.";
        final String PAQUETE_B = "se podrá comprar una grabadora, tres pares de zapatos,cinco camisas y cinco pantalones.";
        final String PAQUETE_C = "se podrá comprar dos pares de zapatos, tres camisas y tres pantalones.";
        final String PAQUETE_D = "se tendrá que conformar con un par de zapatos, dos camisas y dos pantalones.";
        String paquete;
        int cantDinero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dinero que recibirá en el mes de diciembre: ");
        cantDinero = lector.nextInt();
        lector.close();

        if (cantDinero >= 50000) {
            paquete = PAQUETE_A;
        } else if (cantDinero >= 20000) {
            paquete = PAQUETE_B;
        } else if (cantDinero >= 10000) {
            paquete = PAQUETE_C;
        } else{
            paquete = PAQUETE_D;
        }
        System.out.printf("Como recibirá $%d %s ", cantDinero, paquete);
    }
}