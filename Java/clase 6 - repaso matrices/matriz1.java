/*Sumar dos matrices de la misma dimensión: La suma de dos matrices se realiza sumando cada elemento 
correspondiente en las dos matrices. Por ejemplo, si tienes dos matrices A y B, el elemento en la 
primera fila y la primera columna de la matriz sumada C sería la suma del elemento en la primera fila y 
la primera columna de A y el mismo elemento de B.

[1,  2, 3] [10,  20, 30]  [11,   22, 33]

[4, 5, 6]  + [40, 50, 60] = [44, 55, 66]

[7, 8, 9] [70, 80, 90] [77,  88, 99] */

public class matriz1 {
    public static void main(String[] args) {

        int[] matriz1 = {2, 8, 9};
        int[] matriz2 = {6, 4, 3};

         System.out.print("Array 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            System.out.print(matriz1[i] + " ");
        }
        
        System.out.println(); 
        
        System.out.print("Array 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            System.out.print(matriz2[i] + " ");
        }

        // Verifica que las matrices tengan la misma longitud
        if (matriz1.length != matriz2.length) {
            System.out.println("No se pueden sumar las matrices. Las matrices tienen dimensiones diferentes.");
            return; // Salir del programa
        }

        int[] suma = new int[matriz1.length];

        // suma de las matrices elemento por elemento
        for (int i = 0; i < matriz1.length; i++) {
            suma[i] = matriz1[i] + matriz2[i];
        }
        
        System.out.println();

        // Imprime la matriz resultante
        System.out.println("La suma de las matrices es:");
        for (int i = 0; i < suma.length; i++) {
            System.out.print(suma[i] + " ");
        }
    }
}


        
