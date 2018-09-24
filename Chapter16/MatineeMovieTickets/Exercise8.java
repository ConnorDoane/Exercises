import java.util.Scanner;

public class Exercise8 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    final int adultPrice = 8;
    final int adultMPrice = 5;
    final int kidPrice = 4;
    final int kidMPrice = 2;

    int time;
    int age;

    System.out.println("What time is it?");
    time = scan.nextInt();
    System.out.println("What is your age in years?");
    age = scan.nextInt();

    if (time < 1700) {
      //Matinee prices
      if (age > 14) {
        //Adult
        System.out.println("Your ticket will cost " + adultMPrice);
      } else {
        //Kid
        System.out.println("Your ticket will cost " + kidMPrice);
      }
    } else {
      //Normal prices
      if (age > 14) {
        //Adult
        System.out.println("Your ticket will cost " + adultPrice);
      } else {
        //Kid
        System.out.println("Your ticket will cost " + kidPrice);
      }
    }



  }
}
