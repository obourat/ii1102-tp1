import java.util.Scanner;

public class Pave {
  public static void main(String [] args) {

    long a;
    long b;
    long c;

      /**
      * Declaration d'un scanner pour lire des donnees depuis la console */
      Scanner scan = new Scanner(System.in);
      System.out.print("a= ");
      a = scan.nextLong();
      while (a < 0) {
        System.out.println("saisie négative impossible, réessayer");
        System.out.print("a= ");
        a = scan.nextLong();
      };


      System.out.print("b= ");
      b = scan.nextLong();
      while (b < 0) {
        System.out.println("saisie négative impossible, réessayer");
        System.out.print("b= ");
        b = scan.nextLong();

      };

      System.out.print("c= ");
      c = scan.nextLong();
      while (c < 0) {
        System.out.println("saisie négative impossible, réessayer");
        System.out.print("c= ");
        c = scan.nextLong();

      };




      long volume  = a * b * c;
      System.out.println("le volume est "+volume);




  }
}
