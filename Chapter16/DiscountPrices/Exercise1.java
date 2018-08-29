import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner( System.in );

    double p;

    System.out.println("What is the price of your purchase?");
    p = scan.nextDouble();

    if (p <= 10.0)
      System.out.println("Your total is " + p);
    else
      System.out.println("Your total is " + (p * .9));

  }
}
