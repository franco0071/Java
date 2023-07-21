import java.util.Scanner;
import java.util.Arrays;
public class MatrizConMenu {

    public static Scanner miScanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();        
    }

    public static void menu(){
        System.out.println("Bienvenidos a la MATRIX de las BANDANAS");
        System.out.println("1. Mostrar matriz.");
        System.out.println("2. Sumar todos los elementos de la matriz.");
        System.out.println("3. Imprimir número más grande.");
        System.out.println("4. Imprimir número más pequeño.");
        System.out.println("5. Imprimir cantidad de números pares.");
        System.out.println("6. Imprimir cantidad de números impares.");
        System.out.println("7. Imprimir una matriz en orden inverso.");
        System.out.println("8. Imprimir transposición de la matriz.");
        System.out.println("9. Salir.");
        System.out.print("Ingrese opcion: ");
        int opcion = miScanner.nextInt();
        int[][] matriz3x3 = generarMatriz();
        while (opcion != 9){
            switch (opcion){
                case 1:
                    mostrarMatriz(matriz3x3);
                    break;
                case 2:
                    sumarElemMatriz(matriz3x3);
                    break;
                case 3:
                    valorMaximo(matriz3x3);
                    break;
                case 4:
                    valorMinimo(matriz3x3);
                    break;
                case 5:
                    imprimirCantidadNumerosPares(matriz3x3);
                    break;
                case 6:
                    imprimirCantidadNumerosImpares(matriz3x3);
                    break;  
                case 7:
                    imprimirMatrizEnOrdenInverso(matriz3x3);
                    break;
                case 8:
                    MatrizTranspuesta(matriz3x3);
                    break;
            }
            System.out.println("Ingresa otra opcion (PARA SALIR 9): ");
            opcion = miScanner.nextInt();
        }   
    }

    

    public static int obtenerDatos(){
        System.out.print("RECORDATORIO: la matriz va a ser CUADRADA.\nIngrese el tamaño de la matriz: ");
        int tamañoMatriz = miScanner.nextInt();
        return tamañoMatriz;
    }

    public static int[][] generarMatriz(){
        int tamano = obtenerDatos();
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

    public static void sumarElemMatriz(int[][] matriz3x3){
        int sumatoria = 0;

        for (int j = 0; j < matriz3x3.length; j++) {
            for (int i = 0; i < matriz3x3.length; i++) {
                sumatoria+=matriz3x3[i][j];
            }
        }
        System.out.println(); 
        System.out.println("La sumatoria de los elementos de la matriz es: " + sumatoria);
    }


    public static void valorMaximo(int[][] matriz3x3){
        int mayorValor = matriz3x3[0][0];

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                if(matriz3x3[i][j] > mayorValor){
                    mayorValor = matriz3x3[i][j];
                }
            }
        }
        System.out.println("El mayor valor en la matriz es: " + mayorValor);
    }

    public static void valorMinimo(int[][] matriz3x3){
        int menorValor = matriz3x3[0][0];

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                if (matriz3x3[i][j] < menorValor) {
                    menorValor = matriz3x3[i][j];
                }
            }
        }
        System.out.println("El menor valor en la matriz es: " + menorValor);
    }

    public static void imprimirCantidadNumerosPares(int[][] matriz3x3) {
        int cantidadPares = 0;
    
        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                if (matriz3x3[i][j] % 2 == 0) {
                    cantidadPares++;
                }
            }
        }
    
        System.out.println("La cantidad de números pares en la matriz es: " + cantidadPares);
    }
    
    public static void imprimirCantidadNumerosImpares(int[][] matriz3x3) {
        int cantidadImpares = 0;
    
        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                if (matriz3x3[i][j] % 2 != 0) {
                    cantidadImpares++;
                }
            }
        }
    
        System.out.println("La cantidad de números impares en la matriz es: " + cantidadImpares);
    }
    
    public static void imprimirMatrizEnOrdenInverso(int[][] matriz3x3) {
        System.out.println("Matriz en orden inverso:");
        for (int i = matriz3x3.length - 1; i >= 0; i--) {
            System.out.print("[");
            for (int j = matriz3x3[i].length - 1; j >= 0; j--) {
                System.out.print(matriz3x3[i][j]);
                if (j > 0) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    

    public static void MatrizTranspuesta (int[][] matriz3x3){
        //los bucles for anidados copian los elementos de la matriz original en la matriz transpuesta, 
        //pero intercambiando las filas y columnas correspondientes/ 
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
