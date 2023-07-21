/*Escribir un programa que recorra un array de enteros y los imprima en orden inverso,
 comenzando desde el último elemento. */

 
public class bucle4 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10}; 
        
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    } 
}
