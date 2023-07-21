import java.util.Scanner;

public class Puntuacion {
  public static void main (String[] args)  {
    Scanner numeros = new Scanner(System.in);

    System.out.print ("Ingrese la puntuacion: ");
    int puntuacion = numeros.nextInt() ;

    if (puntuacion >0) {
        System.out.print("El numero es positivo");
    }

    else if (puntuacion <0){
        System.out.print ("El numero es negativo");
    }

    else {
        System.out.print("El numero es 0");
    }

   numeros.close();
  }
}
