/*Utilizando como base los ejercicios de clases anteriores, crear un programa que presente un menú de 
opciones para realizar diversas acciones sobre dos matrices. Se deben implementar todos los métodos 
necesarios para cada acción. 

Las opciones del menú son las siguientes:

1. Generar matrices (deben tener el mismo tamaño).

2. Mostrar matrices.

3. Imprimir matriz resultante de la suma de ambas matrices.

4. Imprimir matriz resultante de la multiplicación de ambas matrices.

5. Salir.

❗Recuerda crear los métodos necesarios para cada una de estas acciones y el programa debe mostrar el menú 
de opciones para que el usuario pueda elegir la acción deseada. Además, las matrices deben tener el mismo
 tamaño para realizar las operaciones de suma y multiplicación */

import java.util.Scanner;
import java.util.Arrays;
public class OperacionesSobreMatrices {
     public static Scanner miScanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();        
    }

    public static void menu(){
        System.out.println("Bienvenidos a la MATRIX de las BANDANAS");
        int tamaño = obtenerDatos();
        int[][] matriz3x3 = generarMatriz(tamaño);
        int[][] matriz3x3_1 = generarMatriz(tamaño);
        System.out.println("1. Mostrar matriz.");
        System.out.println("2. Imprimir matriz resultante de la suma de ambas matrices.");
        System.out.println("3. Imprimir matriz resultante de la multiplicacin de ambas matrices.");
        System.out.println("4. Salir.");
        System.out.print("Ingrese opcion: ");
        int opcion = miScanner.nextInt();
        while (opcion != 4){
            switch (opcion){
                case 1:
                    mostrarMatriz(matriz3x3);
                    mostrarMatriz(matriz3x3_1);
                    break;
                case 2:
                    sumarElemMatriz(matriz3x3, matriz3x3_1, tamaño);
                    break;
                case 3:
                    multiplicarMatriz(matriz3x3, matriz3x3_1, tamaño);
                    break;
            }
            System.out.println("Ingresa otra opcion (PARA SALIR 4): ");
            opcion = miScanner.nextInt();
        }   
    }
        public static int obtenerDatos(){
        System.out.print("RECORDATORIO: la matriz va a ser CUADRADA.\nIngrese el tamaño de la matriz: ");
        int tamanoMatriz = miScanner.nextInt();
        return tamanoMatriz;
    }

    public static int[][] generarMatriz(int tamano){
        int[][] matriz3x3 = new int[tamano][tamano];
        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3.length; j++) {
                matriz3x3[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        return matriz3x3;
    }

    public static void mostrarMatriz(int[][] matriz3x3){
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz3x3.length; i++) {
            System.out.println(Arrays.toString(matriz3x3[i]));
        }
    }

    public static void sumarElemMatriz(int[][] matriz3x3, int[][] matriz3x3_1, int tamano){
        int[][] matrizSuma = new int[tamano][tamano];

        for (int j = 0; j < matriz3x3.length; j++) {
            for (int i = 0; i < matriz3x3.length; i++) {
                matrizSuma[j][i] = matriz3x3[j][i]+matriz3x3_1[j][i];
            }
        }
        System.out.println(); 
        System.out.println("Suma de matriz: ");
        for (int i = 0; i < matriz3x3.length; i++) {
            System.out.println(Arrays.toString(matrizSuma[i]));
        }
    }

    public static void multiplicarMatriz(int[][] matriz3x3, int[][] matriz3x3_1, int tamano){
        int[][] matrizMultiplicacion = new int[tamano][tamano];

        for (int j = 0; j < matriz3x3.length; j++) {
            for (int i = 0; i < matriz3x3.length; i++) {
                matrizMultiplicacion[j][i] = matriz3x3[j][i]*matriz3x3_1[j][i];
            }
        }
        System.out.println(); 
        System.out.println("Multiplicacion de matriz: ");
        for (int i = 0; i < matriz3x3.length; i++) {
            System.out.println(Arrays.toString(matrizMultiplicacion[i]));
        }
    } 
}
