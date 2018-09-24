import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int counter = 0;
    double total = 0;

    System.out.println("Enter your number:");
    counter = scan.nextInt();

    while (counter > 0) {
      total = total + (1.0/counter);
      counter = counter - 1;
    }

    System.out.println("Sum is: " + total);

  }
}
