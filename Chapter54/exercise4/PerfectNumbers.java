import java.util.Scanner;

public class PerfectNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Test what number to be perfect (integers only)?");
    double input = scan.nextDouble();

    int total = 0;

    for (int i = 1; i < input; i++) {
      if (input % i == 0) {
        total += i;
      }
    }

    if (total * 1.0 == input) {
      System.out.println("That is a perfect number!");
    } else {
      System.out.println("Sorry, that isn't a perfect number...");
    }

  }
}
