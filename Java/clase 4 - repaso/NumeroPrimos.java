/*Solicitar al usuario que introduzca un número y verificar si es primo utilizando un bucle do-while. 

💡 Un número es primo si solo tiene dos divisores: 1 y él mismo. 

Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo. */

import java.util.Scanner;

public class NumeroPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Introduce un número entero positivo (0 para salir): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }

        System.out.println("¡Hasta luego!");
        scanner.close();
}
    }



