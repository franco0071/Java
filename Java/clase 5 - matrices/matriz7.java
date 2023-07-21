// otra forma de hacer el ejercicio 1

public class matriz7 {
    public static void main(String[] args) {
        int[][] matriz = {{5, 3, 2}, {8, 1, 5}};

        System.out.println("Matriz original:");
        mostrarMatriz(matriz, true);

        System.out.println("\nArreglo:");
        mostrarMatriz(matriz, false);
    }

    public static void mostrarMatriz(int[][] matriz, boolean formatoMatriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (formatoMatriz) {
                    System.out.print("[" + matriz[i][j] + "] ");
                } else {
                    System.out.print("[" + matriz[i][j] + "]");
                }
            }
            System.out.println();
        }
    }
} 

