/*Imprime los elementos de una matriz en orden inverso. */

import java.util.Arrays;

public class Matriz5{
public static void main(String[] args) {
  
        int[][] matriz3x3 = new int[3][3];


        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3.length; j++) {
                matriz3x3[i][j] = (int) (Math.random()*9+1);
            }
        }

        // Imprime la matriz en orden normal
        System.out.println("Matriz en orden normal:");
        for (int i = 0; i < matriz3x3.length; i++) {
            System.out.println(Arrays.toString(matriz3x3[i]));
        }

        // Imprime la matriz en orden inverso
        System.out.println("Matriz en orden inverso:");
        for (int i = matriz3x3.length - 1; i >= 0; i--) {
            for (int j = matriz3x3[i].length - 1; j >= 0; j--) {
                System.out.print(matriz3x3[i][j] + " ");
            }
            System.out.println();
        }
    }
}



