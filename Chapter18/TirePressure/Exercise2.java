import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int frontright;
    int frontleft;
    int backright;
    int backleft;

    System.out.println("What is the Pressure of your Front Right tire? Round to the nearest Whole Number");
    frontright = scan.nextInt();
    System.out.println("Front Left tire?");
    frontleft = scan.nextInt();
    System.out.println("Back Right tire?");
    backright = scan.nextInt();
    System.out.println("And finally, Back left tire");
    backleft = scan.nextInt();

    if ( frontright == frontleft && backright == backleft) {
      System.out.println("Congrats, you're good!");
    } else {
      System.out.println("Uh oh, the front tires should match and the back tires should match. The front and back don't need to match, but make sure both front tires have the same pressure, and both back tires have the same pressure!");
    }
  }
}
