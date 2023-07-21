import java.util.Scanner;

public class Divisibles {
  public static void main (String[] args)  {
    Scanner numeros = new Scanner(System.in);

    System.out.print ("Ingrese el valor: ");
    int puntuacion = numeros.nextInt() ;

     boolean divisiblePor3 = puntuacion % 3 == 0;
     boolean divisiblePor5 = puntuacion % 5 == 0;

     if (divisiblePor3 && divisiblePor5){
        System.out.print("El numero ingresado es divisible por 3 y 5");
     }

     else if (divisiblePor3){
         System.out.print("El numero es divisible por 3");
     }

     else if (divisiblePor5){
         System.out.print("El numero es divisible por 5");
     }

     else {
         System.out.print("El numero no es divisible por 3 ni por 5");
    
    numeros.close();
     }

    }
  } 