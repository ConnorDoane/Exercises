import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double x1;
    double y1;
    double x2;
    double y2;

    System.out.println("First X");
    x1 = scan.nextDouble();
    System.out.println("First Y");
    y1 = scan.nextDouble();
    System.out.println("Second X");
    x2 = scan.nextDouble();
    System.out.println("Second Y");
    y2 = scan.nextDouble();

    while (x1 != x2 && y1 != y2) {
      System.out.println("Width: " + (x2-x1) + " Height: " + (y2 - y1));

      System.out.println();
      System.out.println("First X");
      x1 = scan.nextDouble();
      System.out.println("First Y");
      y1 = scan.nextDouble();
      System.out.println("Second X");
      x2 = scan.nextDouble();
      System.out.println("Second Y");
      y2 = scan.nextDouble();
    }

  }
}
