import java.util.Scanner;

public class Exercise7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    long n = 0;
    long r = 0;
    long temp = 0;
    long total1 = 1;
    long total2 = 1;

    System.out.println("Input N:");
    n = scan.nextLong();
    System.out.println("Input R:");
    r = scan.nextLong();

    if (n <= 0 || r <= 0) {
      System.out.println("N and R both need to be 0 or greater");
    } else if (r >= n) {
      System.out.println("R must be lesser or equal to N");
    } else {
      temp = n;
      while (temp > 0) {
        System.out.println(temp);
        total1 = total1 * temp;
        temp -= 1;
      }
      temp = n - r;
      while (temp > 0) {
        total2 = total2 * temp;
        temp -= 1;
        System.out.println(total2 + " + " + temp);
      }
      System.out.println(total1 / total2);
    }
  }
}
