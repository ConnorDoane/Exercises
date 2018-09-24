import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your first number (or 0 to quit)");
    int add = scan.nextInt();
    int total = add;

    if (total == 0) {
      System.out.println("No integers were entered.");
    } else {
      while (add != 0) {
        System.out.println("Enter an integer (or 0 to quit)");
        add = scan.nextInt();
        total += add;
      }

      System.out.println("Sum: " + total);

    }

  }
}
