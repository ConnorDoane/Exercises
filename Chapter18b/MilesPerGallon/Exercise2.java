import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double finalMiles;
    double gallons;

    System.out.println("Miles Per Gallon Calculator");
    System.out.println("Initial Miles:");
    double initMiles = scan.nextDouble();

    while (initMiles != -1) {
      System.out.println("Final Miles:");
      finalMiles = scan.nextDouble();
      System.out.println("Gallons Used:");
      gallons = scan.nextDouble();

      System.out.println("Miles per Gallon is " + (finalMiles - initMiles) / gallons);

      System.out.println("Initial Miles:");
      initMiles = scan.nextDouble();
    }
  }
}
