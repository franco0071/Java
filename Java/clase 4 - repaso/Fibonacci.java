/*Escribir un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while.
 La serie de Fibonacci es una secuencia donde cada número es la suma de los dos anteriores. 

La serie de Fibonacci comienza de la siguiente manera:

Posición 0: 0

Posición 1: 1

Posición 2: 1 (suma de la posición 0 y la posición 1, 0 + 1 = 1)

Posición 3: 2 (suma de la posición 1 y la posición 2, 1 + 1 = 2)

Posición 4: 3 (suma de la posición 2 y la posición 3, 1 + 2 = 3)

Entonces, los primeros 5 términos (considerando el índice inicial 0) de la serie de Fibonacci son: 0, 1, 1, 2,
 3. */

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8; // Número de términos a imprimir
        int primero = 0;
        int segundo = 1;
        int contador = 0;

        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son:");

        while (contador < n) {
            System.out.println(primero);
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            contador++;
        }
    }
}

