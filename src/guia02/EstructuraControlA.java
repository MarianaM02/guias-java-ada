package guia02;

import java.util.Scanner;

public class EstructuraControlA {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca cuál es la edad mínima para votar en su país: ");
        byte edadMinimaVotar = lector.nextByte();

        System.out.println("Introduzca cuál es la edad del votante: ");
        byte edadVotante = lector.nextByte();
        lector.close();
        
        if (edadVotante >= edadMinimaVotar) {
            System.out.println("Usted puede votar");
        } else {
            System.out.println("Usted no puede ni opinar");
        }
    }
}
