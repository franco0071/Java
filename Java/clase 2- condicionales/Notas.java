import java.util.Scanner;

public class Notas {
  public static void main (String[] args)  {
    Scanner problema = new Scanner(System.in);

    System.out.print ("Ingrese la puntuacion: ");
    int puntuacion = problema.nextInt() ;
    
    if (puntuacion >= 90 && puntuacion <=100){
        System.out.print ("A");
    }
    else if (puntuacion >= 80 && puntuacion <=89){
        System.out.print ("B");
    }
    else if (puntuacion >= 70 && puntuacion <=79){
        System.out.print ("C");
    }
    else if (puntuacion >= 60 && puntuacion <=69){
        System.out.print ("D");
    }
    else if (puntuacion <60){
        System.out.print ("F");
    }
    else {
        System.out.print ("Solo se aceptan valores entre 0 y 100");
    }
    problema.close();
  }
}







