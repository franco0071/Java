/*Escribir un programa que recorra un array de enteros e imprima cada elemento en una línea separada */

public class Bucle1 {
    public static void main(String[] args){
        int[] array = {2,8,4,6,7};

        for (int i = 0; i <= array.length; i++){
            System.out.println("array ["+i+"] = " + array[i]);
        }
    }
}
