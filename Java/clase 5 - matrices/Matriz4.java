/*Encuentra y muestra el número más grande y más pequeño en una matriz. */

import java.util.Arrays;

public class Matriz4 {
    public static void main(String[] args) {

        int[][] matriz3x3 = new int[3][3];
        
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                matriz3x3[i][j] = (int) (Math.random() * 9 + 1);
                if (matriz3x3[i][j] % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            }
        }

        for (int i = 0; i < matriz3x3.length; i++) {
            System.out.println(Arrays.toString(matriz3x3[i]));
        }

        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
    }
}
