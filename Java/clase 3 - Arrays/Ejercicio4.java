/*Escribir un programa que cree un array de 3 enteros y solicite un número al usuario, 
e imprima por consola si está presente en el array o no, sin usar el bucle for. */

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);

    System.out.print ("Ingrese un número del 1 al 10: ");
    int puntuacion = numeros.nextInt();

    int[] array = {2, 4, 6}; // Crear el array de 3 elementos

    if (puntuacion == array[0] || puntuacion == array[1] || puntuacion == array[2]) {
        System.out.println("El número ingresado está presente en el array");
    }

    else{
        System.out.println("El número ingresado no está presente en el array");
    }
    numeros.close();
}
}