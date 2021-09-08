package guia03;


import java.util.Scanner;

//15. Realice un algoritmo que calcule el producto de dos vectores. Uno de ellos es de una fila
//        con diez elementos y el otro con una columna de diez elementos.
public class Ejercicio15_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final int LONGITUD = 10;
        int vectorFila[][] = new int[LONGITUD][1];
        int vectorColumna[][] = new int[1][LONGITUD];

        // Rellenamos el vector fila de 10 elementos
        for (int i = 0; i < LONGITUD; i++) {
            System.out.println("A continuación vamos a completar el vector fila");
            System.out.printf("Ingrese el valor en (%d, %d): ", i, 0);
            vectorFila[i][0] = read.nextInt();
        }
        // Rellenamos el vector columna de 10 elementos
        for (int j = 0; j < LONGITUD; j++) {
            System.out.println("A continuación vamos a completar el vector columna");
            System.out.printf("Ingrese el valor en (%d, %d): ", 0, j);
            vectorColumna[0][j] = read.nextInt();
        }
        read.close();

        // Hacemos el producto de los vectores. Hice la multiplicación en otra variable (mult) pero bien podría hacerse
        // dentro de sum directamente.

        int mult, sum = 0;
        for (int i=0, j=0; i<LONGITUD; i++, j++){
            mult = vectorFila[i][0] * vectorColumna[0][j];
            sum += mult;
        }
        System.out.println("El resultado de la multiplicación de los dos vectores es: " + sum);
    }
}

