import java.util.Scanner;
import java.util.InputMismatchException;

public class Temperatura {
    public static void main(String[] args) {
        try{
            Scanner miScanner = new Scanner(System.in);
            Scanner miScanner1 = new Scanner(System.in);

            System.out.println("Ingrese la temperatura: ");
            int numero = miScanner.nextInt();
            System.out.println("Ingrese unidad de medida (C/F): ");
            String unidad = miScanner1.nextLine();

            int faren = 32;
            int conversion = numero + faren;

            if (unidad.equals("C")){
                System.out.println(numero + " grados Celsius equivale a " + conversion + " grados Fahrenheit.");
            }
            else if(unidad.equals("F")){
                System.out.println(numero + " grados Fahrenheit equivale a " +(-conversion) + " grados Celsius.");
            }
            else{
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
            miScanner.close();
            miScanner1.close();
            
        }catch(InputMismatchException e){
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        }
    }
}