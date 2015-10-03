import java.util.Scanner;
public class Binomrez {
  public static void main(String [] args) {
    long a;
    long b;
    long c;

    Scanner scan = new Scanner(System.in);
    System.out.print("a=");
    a = scan.nextLong();

    System.out.print("b=");
    b = scan.nextLong();

    System.out.print("c=");
    c = scan.nextLong();

    long d = b * b - 4 * a * c;

    if (d>0) {
      double s1 = (- b - Math.sqrt(d))/2*a;
      double s2 = (- b + Math.sqrt(d))/2*a;
      System.out.println("les solutions sont : ");
      System.out.println(s1);
      System.out.println(s2);
    };
    if (d==0) {
      double s = -b/2*a;
      System.out.println("la racine double est : ");
      System.out.println(s);

    };
    if (d<0) {
      System.out.println("le trinôme n'admet pas de solutions réelles");
    };
    System.out.println("Fin");
}
}
