import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    //variables
    double x;
    double y;

    //inputs
    System.out.println("I will now find the Harmonic Mean of two numbers");
    System.out.println("Enter your first number:");
    x = scan.nextDouble();
    System.out.println("Enter your second number:");
    y = scan.nextDouble();

    double h = (2/((1/x) + (1/y)));
    double m = (x + y) / 2;

    System.out.println("The usual mean (Arithmetic Mean) is " + m);
    System.out.println("The Harmonic Mean is " + h);
  }
}
