import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double inRange = 0;
    double outRange = 0;

    System.out.println("Low end of range:");
    double low = scan.nextDouble();
    System.out.println("High end of range:");
    double high = scan.nextDouble();

    System.out.println("Enter data, use zero to quit:");
    double input = scan.nextDouble();

    while (input != 0) {
      if (input >= low && input <= high) {
        inRange += input;
      } else {
        outRange += input;
      }

      System.out.println("Enter data, use zero to quit:");
      input = scan.nextDouble();
    }

    System.out.println("In range values sum: " + inRange);
    System.out.println("Out of range values sum: " + outRange);
  }
}
