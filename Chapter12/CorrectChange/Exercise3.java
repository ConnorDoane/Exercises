import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    int inData;
    Scanner scan = new Scanner( System.in );

    System.out.println("Enter the cent amount: ");
    inData = scan.nextInt();

    int dollars = inData / 100;

    int cents = inData - (dollars*100);

    int quarters = cents / 25;
    cents = cents - (quarters * 25);

    int dimes = cents / 10;
    cents = cents - (dimes * 10);

    int nickels = cents / 5;
    cents = cents - (nickels * 5);

    int pennies = cents;

    System.out.println("You have " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels and " + pennies + " pennies.");
  }
}
