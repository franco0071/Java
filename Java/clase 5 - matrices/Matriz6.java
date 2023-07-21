/* Imprime por consola la transposición de una matriz. La transposición es una nueva matriz donde las
 filas de la matriz original se convierten en columnas y viceversa.

Por ejemplo:

[1, 2, 3] [1, 4, 7]

[4, 5, 6] → [2, 5, 8]

[7, 8 ,9] [3, 6 , 9] */

import java.util.Arrays;

public class Matriz6 {
    public static void main(String[] args) {
        int[][] matriz3x3 = new int[3][3];

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3.length; j++) {
                matriz3x3[i][j] = (int) (Math.random() * 9 + 1);
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < matriz3x3.length; i++) {
            System.out.println(Arrays.toString(matriz3x3[i]));
        }

        /*los bucles for anidados copian los elementos de la matriz original en la matriz transpuesta, 
        pero intercambiando las filas y columnas correspondientes*/ 

        int[][] matrizTranspuesta = new int[matriz3x3.length][matriz3x3.length]; // se crea la nueva matriz
        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3.length; j++) {
                matrizTranspuesta[i][j] = matriz3x3[j][i];
            }
        }

         System.out.println("Matriz transpuesta:"); // se imprime la matriz transpuesta
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            System.out.println(Arrays.toString(matrizTranspuesta[i]));
        }

    }
}    
