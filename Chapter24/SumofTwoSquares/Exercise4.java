import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is n");
    int n = scan.nextInt();

    for (int a = 0; a < n; a++) {
      for (int b = 0; b < a; b++) {
        if ((a*a) + (b*b) == n) {
          System.out.println(a + " Squared and " + b + " Squared = " + n);
          break;
        }
      }
    }
    
  }
}
