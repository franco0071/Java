import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (verificarContrasena(contrasena)) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura. Debe tener al menos una letra mayúscula, una letra minúscula, un número y un carácter especial.");
        }
        scanner.close();
    }

    public static boolean verificarContrasena(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }
        if (!contrasena.matches(".*[A-Z].*")) {
            return false;
        }
        if (!contrasena.matches(".*[a-z].*")) {
            return false;
        }
        if (!contrasena.matches(".*\\d.*")) {
            return false;
        }
        if (!contrasena.matches(".*[!@#$%^&*()_+=\\-{}\\[\\]|,.:;].*")) {
            return false;
        }
        return true;
    }
}

