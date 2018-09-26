import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is the upper limit");
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      int square = i*i;
      int tri = 0;
      for (int j = 1; j <= n; j++) {
        tri += j;
        if (tri == square) {
          System.out.println("Square of " + i + " and Triangle of " + j + " both equal " + square);
        }
      }
    }
  }
}
