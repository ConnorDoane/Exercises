import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variables
    float cAccBalance;
    float sAccBalance;
    float charge;

    //user input
    System.out.println("What is the balance in your Checking Account?");
    cAccBalance = scan.nextFloat();
    System.out.println("What is the balance in your Savings Account?");
    sAccBalance = scan.nextFloat();

    if (cAccBalance > 1000 || sAccBalance > 1500) {
      charge = 0.0f;
    } else {
      charge = 0.15f;
    }

    System.out.println("Writing a check will result in a charge of " + charge);



  }
}
