import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int counter;
    int total = 0;

    System.out.println("How many numbers will be added?");
    counter = scan.nextInt();

    while (counter > 0) {
      counter = counter - 1;
      System.out.println("Enter an integer:");
      total = total + scan.nextInt();
    }

    System.out.println(total);

  }
}
