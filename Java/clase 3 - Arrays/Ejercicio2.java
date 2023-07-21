//Escribir un programa que cree un array de 3 enteros e imprima por consola el promedio de todos sus
// elementos, sin usar el bucle for.

public class Ejercicio2 {
     public static void main(String[] args) {
        int[] array = {2, 4, 6}; // Crear el array de 3 elementos
        
        int suma = ((array[0] + array[1] + array[2]) / array.length); // Sumar los elementos y los divide x 3
        
        System.out.println("El promedio de los elementos del array es: " + suma);
    }
}
