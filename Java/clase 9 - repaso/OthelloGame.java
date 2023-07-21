import java.util.Scanner;

public class OthelloGame {
    private char[][] tablero;
    private char jugadorActual;
    private boolean finJuego;
    private Scanner scanner;

    public OthelloGame() {
        tablero = new char[8][8];
        jugadorActual = 'B';
        finJuego = false;
        scanner = new Scanner(System.in);

        // Inicializar el tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = 'O';
            }
        }

        // Colocar las fichas iniciales blancas y negras
        tablero[3][3] = 'W';
        tablero[3][4] = 'B';
        tablero[4][3] = 'B';
        tablero[4][4] = 'W';
    }

    public void jugar() {
        while (!finJuego) {
            imprimirTablero();
            System.out.println("Jugador actual: " + jugadorActual);
            System.out.print("Ingrese la fila (1-8): ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Ingrese la columna (1-8): ");
            int columna = scanner.nextInt() - 1;
            System.out.println();

            if (esMovimientoValido(fila, columna)) {
                realizarMovimiento(fila, columna);
                jugadorActual = (jugadorActual == 'B') ? 'W' : 'B';
                verificarFinJuego();
            } else {
                System.out.println("Movimiento inválido. Inténtelo nuevamente.");
            }
        }

        imprimirTablero();
        System.out.println("¡Fin del juego!");
        int contadorNegras = contarFichas('B');
        int contadorBlancas = contarFichas('W');

        if (contadorNegras > contadorBlancas) {
            System.out.println("¡Las fichas negras ganan!");
        } else if (contadorBlancas > contadorNegras) {
            System.out.println("¡Las fichas blancas ganan!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }

    public void imprimirTablero() {
        System.out.println("- 1 2 3 4 5 6 7 8");

        for (int i = 0; i < 8; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == 'O') {
                    System.out.print("O ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean esMovimientoValido(int fila, int columna) {
        if (fila < 0 || fila >= 8 || columna < 0 || columna >= 8 || tablero[fila][columna] != 'O') {
            return false;
        }

        int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for (int[] direccion : direcciones) {
            int df = direccion[0];
            int dc = direccion[1];
            int f = fila + df;
            int c = columna + dc;

            if (esCeldaValida(f, c) && tablero[f][c] == obtenerColorContrario()) {
                while (esCeldaValida(f, c) && tablero[f][c] == obtenerColorContrario()) {
                    f += df;
                    c += dc;

                    if (esCeldaValida(f, c) && tablero[f][c] == jugadorActual) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void realizarMovimiento(int fila, int columna) {
        tablero[fila][columna] = jugadorActual;
        int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for (int[] direccion : direcciones) {
            int df = direccion[0];
            int dc = direccion[1];
            int f = fila + df;
            int c = columna + dc;

            if (esCeldaValida(f, c) && tablero[f][c] == obtenerColorContrario()) {
                while (esCeldaValida(f, c) && tablero[f][c] == obtenerColorContrario()) {
                    f += df;
                    c += dc;

                    if (esCeldaValida(f, c) && tablero[f][c] == jugadorActual) {
                        // Voltear las fichas en el camino
                        int filaVoltear = fila + df;
                        int columnaVoltear = columna + dc;

                        while (filaVoltear != f || columnaVoltear != c) {
                            tablero[filaVoltear][columnaVoltear] = jugadorActual;
                            filaVoltear += df;
                            columnaVoltear += dc;
                        }

                        break;
                    }
                }
            }
        }
    }

    public void verificarFinJuego() {
        int contadorNegras = contarFichas('B');
        int contadorBlancas = contarFichas('W');

        if (contadorNegras == 0 || contadorBlancas == 0 || contadorNegras + contadorBlancas == 64) {
            finJuego = true;
        }

        if (!tieneMovimientoValido()) {
            jugadorActual = (jugadorActual == 'B') ? 'W' : 'B';
            if (!tieneMovimientoValido()) {
                finJuego = true;
            }
        }
    }

    public int contarFichas(char color) {
        int contador = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == color) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public boolean tieneMovimientoValido() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (esMovimientoValido(i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    public char obtenerColorContrario() {
        return (jugadorActual == 'B') ? 'W' : 'B';
    }

    public boolean esCeldaValida(int fila, int columna) {
        return fila >= 0 && fila < 8 && columna >= 0 && columna < 8;
    }

    public static void main(String[] args) {
        OthelloGame juego = new OthelloGame();
        juego.jugar();
    }
}
