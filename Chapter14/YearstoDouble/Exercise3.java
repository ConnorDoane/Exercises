import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double rate;

    System.out.println("Enter interest rate:");

    rate = scan.nextDouble();

    System.out.println("Number of years to double: " + (72/rate));
  }
}
