import java.util.Random;
import java.util.Scanner;

public class BatallaNavalConsola {

    private static final int FILAS = 4;
    private static final int COLUMNAS = 4;
    private static final int NUM_BARCOS = 5;

    private static final char AGUA = '~';
    private static final char BARCO = '=';
    private static final char ATACO_AGUA = 'X';
    private static final char ATACO_BARCO = 'A';

    private char[][] computadora;
    private char[][] jugador;
    private Random random;
    private Scanner scanner;

    private boolean turnoJugador;

    public BatallaNavalConsola() {
        computadora = new char[FILAS][COLUMNAS];
        jugador = new char[FILAS][COLUMNAS];
        random = new Random();
        scanner = new Scanner(System.in);
        turnoJugador = true;
    }

    public void iniciarJuego() {
        System.out.println("¡Bienvenido a Batalla Naval de Narvik!");

        generarMapas();

        while (!verificarFinJuego(computadora, ATACO_BARCO) && !verificarFinJuego(jugador, ATACO_BARCO)) {
            if (turnoJugador) {
                turnoJugador();
            } else {
                turnoComputadora();
            }

            imprimirMapas();
            System.out.println();
        }

        if (verificarFinJuego(computadora, ATACO_BARCO)) {
            System.out.println("¡Perdiste, como va a perder el kirchnerismo!");
        } else {
            System.out.println("¡Ganaste vos bro, sos re pro, aguante Milei!");
        }
    }

    private void generarMapas() {
        generarMapa(computadora);
        generarMapa(jugador);
    }

    private void generarMapa(char[][] mapa) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                mapa[i][j] = AGUA;
            }
        }

        int barcosColocados = 0;
        while (barcosColocados < NUM_BARCOS) {
            int fila = random.nextInt(FILAS);
            int columna = random.nextInt(COLUMNAS);
            if (mapa[fila][columna] != BARCO) {
                mapa[fila][columna] = BARCO;
                barcosColocados++;
            }
        }
    }

    private void imprimirMapas() {
        System.out.println("Mapa del enemigo:");
        imprimirMapa(computadora, false);
        System.out.println();
        System.out.println("Tu Mapa, puros telos figuran bro, que onda:");
        imprimirMapa(jugador, true);
    }

    private void imprimirMapa(char[][] mapa, boolean mostrarBarcos) {
        char letra = 'A';
        System.out.print("  ");
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.print((j + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < FILAS; i++) {
            System.out.print(letra + " ");
            for (int j = 0; j < COLUMNAS; j++) {
                char c = mapa[i][j];
                if (c == BARCO && !mostrarBarcos) {
                    c = AGUA;
                }
                System.out.print(c + " ");
            }
            System.out.println();
            letra++;
        }
    }

    private void turnoJugador() {
        System.out.println("Tu turno, metele mecha.");
        int fila, columna;
        do {
            System.out.print("Ingresa las coordenadas de ataque (Ejemplo: A1): ");
            String coordenadas = scanner.nextLine().toUpperCase();
            fila = coordenadas.charAt(0) - 'A';
            columna = coordenadas.charAt(1) - '1';
        } while (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS ||
                jugador[fila][columna] == ATACO_AGUA || jugador[fila][columna] == ATACO_BARCO);

        if (computadora[fila][columna] == BARCO) {
            jugador[fila][columna] = ATACO_BARCO;
            System.out.println("¡Le metiste terrible misil balistico, bien ahi!!!");
        } else {
            jugador[fila][columna] = ATACO_AGUA;
            System.out.println("Erraste, como Pavone contra Belgrano, pecho frio!!!.");
        }

        turnoJugador = false;
    }

    private void turnoComputadora() {
        System.out.println("Turno de la Computadora de atacar.");
        int fila, columna;
        do {
            fila = random.nextInt(FILAS);
            columna = random.nextInt(COLUMNAS);
        } while (computadora[fila][columna] == ATACO_AGUA || computadora[fila][columna] == ATACO_BARCO);

        if (jugador[fila][columna] == BARCO) {
            computadora[fila][columna] = ATACO_BARCO;
            System.out.println("¡La Computadora te bajo un barco, no como vos, que no le bajas la luna a nadie!");
        } else {
            computadora[fila][columna] = ATACO_AGUA;
            System.out.println("La Computadora fallo, como vos al meterte con tu novia, bigote.");
        }

        turnoJugador = true;
    }

    private boolean verificarFinJuego(char[][] mapa, char simboloBarco) {
        int contador = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (mapa[i][j] == simboloBarco) {
                    contador++;
                }
            }
        }
        return contador == NUM_BARCOS;
    }

    public static void main(String[] args) {
        BatallaNavalConsola juego = new BatallaNavalConsola();
        juego.iniciarJuego();
    }
}
