import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    //variables
    double v;
    double p;
    double r;
    double n;
    double t;

    //inputs
    System.out.println("What is the initial deposit into your account?");
    p = scan.nextDouble();
    System.out.println("What is your interest rate (in decimals)?");
    r = scan.nextDouble();
    System.out.println("How many times per year is your interest calculated?");
    n = scan.nextDouble();
    System.out.println("How many years will your money be calculated?");
    t = scan.nextDouble();

    v = Math.pow((1 + (r/n)),(n*t)) * p;

    System.out.println("Your value after " + t + " years will be " + v);
  }
}
