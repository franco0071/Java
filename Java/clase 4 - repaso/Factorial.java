/*Escribir un programa que solicite al usuario un número y calcule su factorial utilizando un bucle do-while. 

💡 El factorial de un número es el producto de todos los números desde 1 hasta ese número. Te compartimos
 algunos ejemplos:

El factorial de 3 es 1 * 2 * 3 = 6.

El factorial de 5 es 1 * 2 * 3 * 4 * 5 = 120.

El factorial de 7 es 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040. */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero positivo (0 para salir): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                long factorial = 1;

                for (int i = 1; i <= numero; i++) {
                    factorial *= i;
                }

                System.out.println("El factorial de " + numero + " es: " + factorial);
            }
        } while (numero != 0);

        System.out.println("¡Hasta luego!");
        scanner.close();
    }
}