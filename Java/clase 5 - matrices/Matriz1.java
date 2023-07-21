// Crea una matriz de 3x3 con enteros y muestra su contenido por consola en formato de matriz. Luego, 
// muestra el mismo contenido en formato de arreglo. Por ejemplo:

// Matriz original:

// [5, 3, 2]

//[8, 1, 5]

// Arreglo:

// [5] [3] [2]

// [8] [1] [5] 

import java.util.Arrays;

public class Matriz1{
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
        
        System.out.println();
        System.out.println("[" + matriz3x3[0][0] + "]" + "[" + matriz3x3[0][1] + "]" + "[" + matriz3x3[0][2] + "]" );
        System.out.println("[" + matriz3x3[1][0] + "]" + "[" + matriz3x3[1][1] + "]" + "[" + matriz3x3[1][2] + "]" );
        System.out.println("[" + matriz3x3[2][0] + "]" + "[" + matriz3x3[2][1] + "]" + "[" + matriz3x3[2][2] + "]" );
        System.out.println();

        for (int j = 0; j < matriz3x3.length; j++) {    // hace lo mismo que los print de arriba pero en un solo paso
            for (int i = 0; i < matriz3x3.length; i++) {
                System.out.print("[" + matriz3x3[j][i] + "]");
            }
            System.out.println();
        }
    }

}