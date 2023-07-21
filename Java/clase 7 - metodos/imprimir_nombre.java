import java.util.Scanner;

public class imprimir_nombre {

    public static Scanner miscanombre = new Scanner(System.in);

    public static void main(String[] args) {
        imprimirNombre();
    } 

    public static void imprimirNombre (){
        System.out.println("Ingrese su nombre: ");
        String nombre = miscanombre.nextLine();
        System.out.println("Mi nombre es " + nombre);
    }

    public static void imprimirNombreyEdad (){
        System.out.println("Ingrese su nombre: ");
        String nombre = miscanombre.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = miscanombre.nextInt();
        System.out.println("Mi nombre es " + nombre + "y tengo " + edad + "años de edad");
    }
}