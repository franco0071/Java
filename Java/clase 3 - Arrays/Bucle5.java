/* Escribir un programa que recorra un array de enteros y lo invierta (es decir, el primer
 elemento pasa a ser el último y viceversa) y lo imprima por consola */

public class Bucle5 {
    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10}; 
        int inicio = 0;
        int fin = array.length - 1;
        
        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;
            
            inicio++;
            fin--;
        }
        
        System.out.println("Array invertido:");
        for (int num : array) {
            System.out.println(num);
        }
    }

}
