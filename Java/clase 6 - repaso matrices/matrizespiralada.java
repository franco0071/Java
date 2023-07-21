/* Matriz espiralada: Pedir al usuario dos números para crear una matriz 
“tamaño1 x tamaño2” y luego rellenarla de forma espiralada en sentido
horario, comenzando desde (0,0). Por ejemplo, una matriz 3x4 se llenaría de la siguiente manera:
[1, 2, 3, 4]
[10, 11 , 12 ,5]
[9, 8, 7, 6]
*/

import java.util.Scanner;
import java.util.Arrays;

public class matrizespiralada{
    public static void main(String[] args) {
        int filas;
        int columnas;
        
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese filas de matriz: ");
        filas= miScanner.nextInt();
        System.out.println("Ingrese columna de matriz: ");
        columnas= miScanner.nextInt();

        int[][] matrizEspiralada = new int[filas][columnas];

        

        for (int i = 0; i < matrizEspiralada.length; i++) {
            System.out.println(Arrays.toString(matrizEspiralada[i])); //toString nos imprime matriz completa
        }

        System.out.println();

        for (int i = 0; i < matrizEspiralada.length; i++) {
            matrizEspiralada[0][i]++;
        }

        for (int j = 0; j < matrizEspiralada.length; j++) {
            matrizEspiralada[j][3]++;
        }

        for (int k = matrizEspiralada.length - 1; k >= 0; k--) {
            matrizEspiralada[2][k]++;
        }

        for (int i = 0; i < matrizEspiralada.length ; i++) {
            matrizEspiralada[1][i]++;
        }

        for (int i = 0; i < matrizEspiralada.length; i++) {
            System.out.println(Arrays.toString(matrizEspiralada[i])); //toString nos imprime matriz completa
        }
        miScanner.close();
    }
 }
