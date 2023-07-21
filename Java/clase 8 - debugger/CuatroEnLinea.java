import java.util.Scanner;

public class CuatroEnLinea {
    private static final int FILAS = 6;
    private static final int COLUMNAS = 7;
    private static final char VACIO = 'O';
    private static final char JUGADOR = 'J';
    private static final char COMPUTADORA = 'C';

    private char[][] tablero;
    private Scanner scanner;

    public CuatroEnLinea() {
        tablero = new char[FILAS][COLUMNAS];
        scanner = new Scanner(System.in);
    }

    public void jugar() {
        iniciarTablero();
        char turno = JUGADOR;

        while (true) {
            imprimirTablero();
            if (turno == JUGADOR) {
                turnoJugador();
            } else {
                turnoComputadora();
            }

            if (hayGanador(turno)) {
                imprimirTablero();
                System.out.println("¡" + turno + " ha ganado!");
                break;
            }

            if (tableroLleno()) {
                imprimirTablero();
                System.out.println("¡Empate!");
                break;
            }

            turno = (turno == JUGADOR) ? COMPUTADORA : JUGADOR;
        }
    }

    private void iniciarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = VACIO;
            }
        }
        // Colocar ficha de la computadora en la columna central
        tablero[0][COLUMNAS / 2] = COMPUTADORA;
    }

    private void imprimirTablero() {
        System.out.println("1 2 3 4 5 6 7");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void turnoJugador() {
        int columna;
        do {
            System.out.print("Elige una columna (1-7): ");
            columna = scanner.nextInt() - 1;
        } while (!columnaValida(columna) || !columnaVacia(columna));

        colocarFicha(JUGADOR, columna);
    }

    private void turnoComputadora() {
        int columna;

        if (puedeGanar(COMPUTADORA)) {
            columna = columnaGanadora(COMPUTADORA);
        } else if (puedeGanar(JUGADOR)) {
            columna = columnaGanadora(JUGADOR);
        } else {
            columna = columnaOptima(COMPUTADORA);
        }

        colocarFicha(COMPUTADORA, columna);
        System.out.println("La computadora ha colocado su ficha en la columna " + (columna + 1));
    }

    private boolean columnaValida(int columna) {
        return columna >= 0 && columna < COLUMNAS;
    }

    private boolean columnaVacia(int columna) {
        return tablero[0][columna] == VACIO;
    }

    private void colocarFicha(char ficha, int columna) {
        for (int i = FILAS - 1; i >= 0; i--) {
            if (tablero[i][columna] == VACIO) {
                tablero[i][columna] = ficha;
                break;
            }
        }
    }

    private boolean tableroLleno() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tablero[i][j] == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hayGanador(char ficha) {
        // Comprobar líneas horizontales
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j <= COLUMNAS - 4; j++) {
                if (tablero[i][j] == ficha &&
                    tablero[i][j + 1] == ficha &&
                    tablero[i][j + 2] == ficha &&
                    tablero[i][j + 3] == ficha) {
                    return true;
                }
            }
        }

        // Comprobar líneas verticales
        for (int i = 0; i <= FILAS - 4; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tablero[i][j] == ficha &&
                    tablero[i + 1][j] == ficha &&
                    tablero[i + 2][j] == ficha &&
                    tablero[i + 3][j] == ficha) {
                    return true;
                }
            }
        }

        // Comprobar diagonales hacia la derecha
        for (int i = 0; i <= FILAS - 4; i++) {
            for (int j = 0; j <= COLUMNAS - 4; j++) {
                if (tablero[i][j] == ficha &&
                    tablero[i + 1][j + 1] == ficha &&
                    tablero[i + 2][j + 2] == ficha &&
                    tablero[i + 3][j + 3] == ficha) {
                    return true;
                }
            }
        }

        // Comprobar diagonales hacia la izquierda
        for (int i = 0; i <= FILAS - 4; i++) {
            for (int j = 3; j < COLUMNAS; j++) {
                if (tablero[i][j] == ficha &&
                    tablero[i + 1][j - 1] == ficha &&
                    tablero[i + 2][j - 2] == ficha &&
                    tablero[i + 3][j - 3] == ficha) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean puedeGanar(char ficha) {
        for (int columna = 0; columna < COLUMNAS; columna++) {
            if (columnaVacia(columna) && columnaCompleta(ficha, columna)) {
                return true;
            }
        }
        return false;
    }

    private boolean columnaCompleta(char ficha, int columna) {
        for (int i = FILAS - 1; i >= 0; i--) {
            if (tablero[i][columna] == VACIO) {
                tablero[i][columna] = ficha;
                boolean ganador = hayGanador(ficha);
                tablero[i][columna] = VACIO;
                return ganador;
            }
        }
        return false;
    }

    private int columnaGanadora(char ficha) {
        for (int columna = 0; columna < COLUMNAS; columna++) {
            if (columnaVacia(columna) && columnaCompleta(ficha, columna)) {
                return columna;
            }
        }
        return -1;
    }

    private int columnaOptima(char ficha) {
        int columnaOptima = -1;
        int maxFichas = -1;

        for (int columna = 0; columna < COLUMNAS; columna++) {
            if (columnaVacia(columna)) {
                int fila = obtenerFila(columna);
                int fichasCercanas = contarFichasCercanas(ficha, fila, columna);
                if (fichasCercanas > maxFichas) {
                    maxFichas = fichasCercanas;
                    columnaOptima = columna;
                }
            }
        }

        return columnaOptima;
    }

    private int obtenerFila(int columna) {
        for (int i = FILAS - 1; i >= 0; i--) {
            if (tablero[i][columna] == VACIO) {
                return i;
            }
        }
        return -1;
    }

    private int contarFichasCercanas(char ficha, int fila, int columna) {
        int fichasCercanas = 0;

        // Comprobar líneas horizontales
        fichasCercanas += contarFichasEnLinea(ficha, fila, columna, 0, 1); // Derecha
        fichasCercanas += contarFichasEnLinea(ficha, fila, columna, 0, -1); // Izquierda

        // Comprobar líneas verticales
        fichasCercanas += contarFichasEnLinea(ficha, fila, columna, 1, 0); // Abajo

        // Comprobar diagonales hacia la derecha
        fichasCercanas += contarFichasEnLinea(ficha, fila, columna, 1, 1); // Abajo-Derecha
        fichasCercanas += contarFichasEnLinea(ficha, fila, columna, -1, -1); // Arriba-Izquierda

        // Comprobar diagonales hacia la izquierda
        fichasCercanas += contarFichasEnLinea(ficha, fila, columna, 1, -1); // Abajo-Izquierda
        fichasCercanas += contarFichasEnLinea(ficha, fila, columna, -1, 1); // Arriba-Derecha

        return fichasCercanas;
    }

    private int contarFichasEnLinea(char ficha, int fila, int columna, int incrementoFila, int incrementoColumna) {
        int fichasEnLinea = 0;
        fila += incrementoFila;
        columna += incrementoColumna;

        while (fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS && tablero[fila][columna] == ficha) {
            fichasEnLinea++;
            fila += incrementoFila;
            columna += incrementoColumna;
        }

        return fichasEnLinea;
    }

    public static void main(String[] args) {
        CuatroEnLinea juego = new CuatroEnLinea();
        juego.jugar();
    }
}
