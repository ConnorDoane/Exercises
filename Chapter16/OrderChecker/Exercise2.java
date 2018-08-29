import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {

    //initialization
    Scanner scan = new Scanner(System.in);

    //variables
    double bolts;
    double nuts;
    double washers;
    final double boltprice = 5;
    final double nutprice = 3;
    final double washerprice = 1;

    //promptuser
    System.out.println("How many bolts are you buying?");
    bolts = scan.nextInt();
    System.out.println("How many nuts are you buying?");
    nuts = scan.nextInt();
    System.out.println("How many washers are you buying?");
    washers = scan.nextInt();

    //output
    if (nuts < bolts) {
      System.out.println("Too few Nuts");
    } else if ((bolts*2) > washers) {
      System.out.println("Too few Washers");
    }

    System.out.println("Total price: " + ((bolts * boltprice) + (nuts * nutprice) + (washers * washerprice)));

  }
}
