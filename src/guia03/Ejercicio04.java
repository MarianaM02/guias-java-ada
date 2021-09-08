package guia03;
import java.util.Scanner;

/*
4.	Realice un algoritmo para obtener una matriz como el resultado de la resta de dos matrices de orden M x N.
Represéntelo mediante diagrama de flujo y pseudocódigo.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        int filas, columnas;

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese las filas de la primer matriz: ");
        filas = lector.nextInt();
        System.out.println("Ingrese las columnas de la primer matriz: ");
        columnas = lector.nextInt();
        lector.close();

        int matriz_1[][] = new int[filas][columnas];
        int matriz_2[][] = new int[filas][columnas];
        int matriz_3[][] = new int[filas][columnas];

        System.out.println("MATRIZ 1");
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columnas; j++){
                System.out.printf("Ingrese el numero de la fila %d, columna %d: ", i, j);
                matriz_1[i][j]= lector.nextInt();
            }
        }

        System.out.println("\nMATRIZ 2");
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columnas; j++){
                System.out.printf("Ingrese el numero de la fila %d, columna %d: ", i, j);
                matriz_2[i][j]= lector.nextInt();
            }
        }

        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columnas; j++){
                matriz_3[i][j]= matriz_1[i][j] - matriz_2[i][j];
            }
        }

        System.out.println("\nResultado de la resta: ");
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columnas; j++){
                System.out.print(matriz_3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
