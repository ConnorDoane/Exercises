import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double total = 1;

    System.out.println("How many people will be at your party?");
    int n = scan.nextInt();

    if (n >= 365) {
      System.out.println("0% chance");
    } else {
      for (int i = 1; i < n; i++) {
        total = total * ((365.0 - i)/365.0);
      }
      System.out.println(total * 100);
    }


  }
}
