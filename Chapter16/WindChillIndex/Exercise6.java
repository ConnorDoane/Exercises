import java.util.Scanner;

public class Exercise6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double speed;
    double temperature;
    double windChill;

    System.out.println("What is the Wind speed?");
    speed = scan.nextDouble();
    System.out.println("What is the Temperature?");
    temperature = scan.nextDouble();

    if (speed < 3.0) {
      windChill = 0;
    } else if (temperature > 50) {
      windChill = 0;
    } else {
      windChill = 35.74 + (temperature * 0.6215) - (35.75*Math.pow(speed, 0.16)) + (0.4275 * temperature * Math.pow(speed, 0.16));
    }

    System.out.println("The current windchill is " + windChill);

  }
}
