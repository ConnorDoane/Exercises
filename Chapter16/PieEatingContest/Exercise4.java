import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println("What is your weight?");
    double weight = scan.nextDouble();

    if ((weight-250) > 30 || (weight-250) < -30)
      System.out.println("You are not eligible for the Contest");
    else
      System.out.println("You are eligible for the Contest");

  }
}
