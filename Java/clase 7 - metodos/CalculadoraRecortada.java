import java.util.Scanner;
public class CalculadoraRecortada {

    public static Scanner miscanombre = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.print("Bienvenidos a la calculadora de la banda.\n1 - SUMA\n2 - RESTA\n3 - MULTIPLICACION\n4 - DIVISION \nIngresa la opcion (0 para SALIR): ");
        int opcion = miscanombre.nextInt();
        while (opcion != 0){
            switch (opcion){
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    division();
                    break;
            }
            System.out.println("Ingresa otra opcion (PARA SALIR 0): ");
            opcion = miscanombre.nextInt();
        }
    }
    public static int obtenerPrimerValor(){
        System.out.print("Ingrese primer valor: ");
        int valor1 = miscanombre.nextInt();
        return valor1;
    }
    public static int obtenerSegundoValor(){
        System.out.print("Ingrese segundo valor: ");
        int valor2 = miscanombre.nextInt();
        return valor2;
    }

    public static void suma(){
        System.out.println("La suma es: " + (obtenerPrimerValor() + obtenerSegundoValor())); 
    }

    public static void resta(){
        System.out.println("La resta es: " + (obtenerPrimerValor() - obtenerSegundoValor())); 
    }

    public static void multiplicacion(){
        System.out.println("La multiplicacion es: " + (obtenerPrimerValor() * obtenerSegundoValor())); 
    }
    public static void division(){
        try {
            System.out.println("La division es: " + (obtenerPrimerValor() / obtenerSegundoValor()));
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0.");
        }
    }
}
