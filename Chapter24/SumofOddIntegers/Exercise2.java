import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double total;

    System.out.println("What is n");
    double n = scan.nextDouble();

    for (int i = 1; i < n; i++) {
      if (i % 2 != 0) {
        total += i;
      }
    }

    double squared = n * n;

    System.out.println("Sum: " + total + " Squared: " + squared);
  }
}
