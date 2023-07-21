import java.util.Scanner ;

public class MiPrimerPrograma {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in) ;
        
        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Imprimir el nombre ingresado
        System.out.println("Nombre: " + nombre);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Imprimir el número ingresado
        System.out.println("Número: " + numero);

        scanner.nextLine(); // Limpiar el buffer del scanner

        // Solicitar al usuario su nombre
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        // Solicitar al usuario su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Imprimir mensaje con el nombre y la edad del usuario
        System.out.println("Su nombre es " + nombreUsuario + " y su edad es " + edad);

        scanner.close();

    }
}