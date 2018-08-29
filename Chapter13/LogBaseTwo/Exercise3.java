import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    //variables
    double x;

    //inputs
    System.out.println("Enter the number to find the LogBase2 of:");
    x = scan.nextDouble();

    System.out.println("log base 2 of your number is " + (Math.log(x) / Math.log(2)));



  }
}
