import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //Variables
    int hours;
    int zones;
    int depart;
    int arrive;

    System.out.println("How many hours did you travel?");
    hours = scan.nextInt();
    System.out.println("How many zones did you cross?");
    zones = scan.nextInt();
    System.out.println("When did you depart in Military Time?");
    depart = scan.nextInt();
    System.out.println("When did you arrive in Military Time?");
    arrive = scan.nextInt();

    //calculations
    if (depart > 800 && depart <= 1200) {
      depart = 0;
    } else if (depart > 1200 && depart <= 1800) {
      depart = 1;
    } else if (depart > 1800 && depart <= 2200) {
      depart = 3;
    } else if (depart > 2200 || depart <= 100) {
      depart = 4;
    } else if (depart > 100 && depart <= 800) {
      depart = 5;
    }

    if (arrive > 800 && arrive <= 1200) {
      arrive = 4;
    } else if (arrive > 1200 && arrive <= 1800) {
      arrive = 2;
    } else if (arrive > 1800 && arrive <= 2200) {
      arrive = 0;
    } else if (arrive > 2200 || arrive <= 100) {
      arrive = 1;
    } else if (arrive > 100 && arrive <= 800) {
      arrive = 3;
    }

    System.out.println("The number of days you need to recover is " + (hours/2 + (zones - 3) + depart + arrive) * 0.1);



  }
}
