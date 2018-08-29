import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);

    System.out.println("Enter a device's Voltage:");
    int inV = scan.nextInt();
    System.out.println("Now enter the device's Resistance:");
    int inR = scan.nextInt();

    float I = (float)inV / (float)inR;

    System.out.println("The current in your device is " + I);

  }
}
