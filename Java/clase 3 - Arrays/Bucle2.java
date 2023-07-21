/*Escribir un programa que recorra un array de enteros y calcule la suma acumulada de los elementos,
 reemplazando cada elemento por la suma acumulada hasta ese punto. */

public class Bucle2 {
     public static void main(String[] args){
        int[] array = {2,8,4,6,7};

        int sumaAcumulada = 0;
        
        for (int i = 0; i < array.length; i++) {
            sumaAcumulada += array[i]; // Suma acumulada hasta el elemento actual
            array[i] = sumaAcumulada; // Reemplazar el elemento por la suma acumulada
        }
        
        System.out.println("Array con suma acumulada:");
        for (int num : array) {  // num toma cada valor de "array" y los va reemplazando
            System.out.println(num);
        }
    }

}
