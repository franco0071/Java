/*Escribir un programa que recorra un array de enteros y encuentre 
el valor mínimo presente en el array. */

public class Bucle3 {
    public static void main(String[] args) {

        int[] array = {2,8,4,6,7}; // Array de enteros
        int min = array[0]; // Asignar el primer elemento como valor mínimo
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Actualizar el valor mínimo si se encuentra un elemento menor
            }
        }
        
        System.out.println("El valor mínimo en el array es: " + min);
    }
}



