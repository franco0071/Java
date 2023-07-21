/*Escribir un programa que cree un array de 3 enteros y devuelva el valor máximo presente en el array,
 sin usar el bucle for */

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6}; // Crear el array de 3 elementos

        int maximo =  Math.max(array[0], Math.max(array[1], array[2])); // Comparamos el primer elemento con el máximo de los otros dos elementos
        
        System.out.println("El máximo de los elementos del array es: " + maximo);
    }
}
