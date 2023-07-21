import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[4];

        System.out.println("Ingrese cuatro nombres:");
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = scanner.nextLine();
        }

        Arrays.sort(nombres); // Ordena los nombres alfabeticamente

        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        scanner.close();
    }
}
