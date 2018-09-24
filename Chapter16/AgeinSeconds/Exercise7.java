import java.util.Scanner;

public class Exercise7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int years;
    int months;
    int days;

    System.out.println("What is your age in years?");
    years = scan.nextInt();
    System.out.println("How many extra months?");
    months = scan.nextInt();
    System.out.println("And how many days?");
    days = scan.nextInt();

    int yeardays = years*365;
    int monthdays = months*30;
    days = days + yeardays + monthdays;
    int hours = days * 24;
    int minutes = hours * 60;
    int seconds = minutes * 60;

    double percentage = seconds / 25000000000.0;

    System.out.println("You've been alive for " + seconds + " seconds!");
    System.out.println("You've lived for approximately " + percentage*100 + " percent of your expected lifespan.");

  }
}
