/*Siguiendo el ejemplo del tercer ejercicio, el desafío ahora es desarrollar un programa que 
solicite al usuario la cantidad deseada de números primos a obtener. 

El programa debe generar y mostrar la cantidad de números primos solicitada por el usuario. */

import java.util.Scanner;

public class NumerosPrimos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad deseada de números primos a obtener: ");
        int cantidadPrimos = scanner.nextInt();

        int contador = 0;
        int numero = 2;

        System.out.println("Los primeros " + cantidadPrimos + " números primos son:");

        while (contador < cantidadPrimos) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
