import java.util.Scanner;

public class OdiousNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int oneCounter = 0;
    int zeroCounter = 0;

    System.out.println("Enter a decimal number:");
    int input = scan.nextInt();

    while (input != 0) {
      if (input % 2 == 1) {
        oneCounter++;
      } else {
        zeroCounter++;
      }
      input /= 2;
    }

    if(oneCounter % 2 == 1) {
      System.out.println("This number is Odious!");
    } else {
      System.out.println("This number is Evil!");
    }
  }
}
