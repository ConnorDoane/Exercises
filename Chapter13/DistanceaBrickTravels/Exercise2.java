import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    //variables
    double g = 32.174;
    double t;

    //inputs
    System.out.println("Enter the number of seconds:");
    t = scan.nextDouble();

    System.out.println("The brick is falling " + (0.5) * g * t * t + " units");



  }
}
