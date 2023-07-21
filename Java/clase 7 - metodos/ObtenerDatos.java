import java.util.Scanner;

public class ObtenerDatos { 
    public static void main(String[] args) {
        Scanner miscanombre = new Scanner(System.in);
        System.out.println("Mi nombre es " + obtenerNombre(miscanombre) + " y tengo " + obtenerEdad(miscanombre) + " años.");
    }

    public static String obtenerNombre(Scanner pepe){
        System.out.println("Ingrese su nombre: ");
        return pepe.nextLine();
    }

    public static int obtenerEdad(Scanner pepe){
        System.out.println("Ingrese su edad: ");
        return pepe.nextInt();
    }
}
