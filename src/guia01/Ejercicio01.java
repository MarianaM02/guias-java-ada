package guia01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //float base, altura, area;
        int base, altura;
        float area;

        Scanner lector = new Scanner(System.in);

        System.out.println("-------AREA TRIANGULO-------");
        System.out.println("Ingrese la base:");
        //base = lector.nextFloat();
        base = lector.nextInt();
        System.out.println("Ingrese la altura:");
        //altura = lector.nextFloat();
        altura = lector.nextInt();
        lector.close();
        area = (base*altura)/2.0f;

        System.out.println("El area del Triangulo es " + area);

    }

}
