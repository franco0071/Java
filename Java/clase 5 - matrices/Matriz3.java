/*Encuentra y muestra el número más grande y más pequeño en una matriz. */

import java.util.Arrays;

public class Matriz3 {
    public static void main(String[] args) {
        int[][] matriz3x3 = new int[3][3];

         for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3.length; j++) {
                matriz3x3[i][j] = (int) (Math.random()*9+1);
            }
        }
        
        for (int i = 0; i < matriz3x3.length; i++) {
            System.out.println(Arrays.toString(matriz3x3[i]));
        }

        int menorValor = matriz3x3[0][0];
        int mayorValor = matriz3x3[0][0];

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                if (matriz3x3[i][j] < menorValor) {
                    menorValor = matriz3x3[i][j];
                }
                if(matriz3x3[i][j] > mayorValor){
                    mayorValor = matriz3x3[i][j];
                }
            }
        }
        System.out.println("El mayor valor en la matriz es: " + mayorValor);
        System.out.println("El menor valor en la matriz es: " + menorValor);
    }
}
