import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    int inData;
    Scanner scan = new Scanner( System.in );

    System.out.println("Enter the cent amount: ");
    inData = scan.nextInt();

    int dollars = inData / 100;

    int cents = inData - (dollars*100);

    System.out.println("You have " + dollars + " dollars and " + cents + " cents");
  }
}
