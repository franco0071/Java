/*Basándote en el primer ejercicio, ahora crear un programa que solicite al usuario ingresar la
 posición de un número en la serie de Fibonacci y mostrar el valor correspondiente a esa posición. 

💡Recuerda que la serie de Fibonacci comienza con los siguientes valores:

Posición 0: 0

Posición 1: 1

Posición 2: 1

Posición 3: 2

Posición 4: 3

public class Fibonacci2 {
    
} */

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la posición del número en la serie de Fibonacci: ");
        int posicion = scanner.nextInt();

        int resultado = obtenerNumeroFibonacci(posicion);

        System.out.println("El número en la posición " + posicion + " de la serie de Fibonacci es: " + resultado);
    scanner.close();
    }

    public static int obtenerNumeroFibonacci(int posicion) {
        if (posicion <= 1) {
            return posicion;
        }

        int primero = 0;
        int segundo = 1;
        int contador = 2;

        while (contador <= posicion) {
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            contador++;
        }

        return segundo;
    }
}
