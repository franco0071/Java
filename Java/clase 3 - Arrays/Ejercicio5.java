import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] arrayOriginal = {2, 4, 6}; // Crear el array original de 3 enteros
        
        int[] arrayCopia = Arrays.copyOf(arrayOriginal, arrayOriginal.length + 2); // Crear la copia con tamaño extra
        
        System.out.println("Contenido del nuevo array:");
        for (int num : arrayCopia) {
            System.out.println(num);
        }
    }
}


