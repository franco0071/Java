/*Suma de los elementos de una matriz: Calcula e imprime la suma de todos 
 los elementos de la matriz.*/

import java.util.Arrays;

public class Matriz2{
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

        int sumatoria = 0;

        for (int j = 0; j < matriz3x3.length; j++) {
            for (int i = 0; i < matriz3x3.length; i++) {
                sumatoria+=matriz3x3[i][j];
            }
        }
        System.out.println(); 
        System.out.println("La sumatoria de los elementos de la matriz es: " + sumatoria);
    }
}