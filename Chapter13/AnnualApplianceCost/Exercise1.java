import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    float inCents;
    float inKWH;

    //inputs
    System.out.println("Enter cost per kilowatt-hour in cents");
    inCents = scan.nextFloat();
    System.out.println("Enter kilowatt-hours used per year");
    inKWH = scan.nextFloat();

    //calculations
    float cost = (inCents * inKWH) / 100;

    //output
    System.out.println("Your annual cost is " + cost);

  }
}
