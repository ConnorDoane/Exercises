import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variables
    int start = 0;
    int end = 0;

    //inputs
    System.out.println("Enter Starting Integer:");
    start = scan.nextInt();
    System.out.println("Enter Ending Integer:");
    end = scan.nextInt();
    System.out.println(" ");

    if (start <= end) {
      while (start != end) {
        System.out.println(start);
        start = start + 1;
      }
      System.out.println(start);
    }
  }
}
