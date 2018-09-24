import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("How many stars in the first line?");
    int count = scan.nextInt();

    while (count > 0) {
      for (int i = 0; i < count; i++) {
        System.out.print("*");
      }
      System.out.println("");
      count--;
    }
  }
}
