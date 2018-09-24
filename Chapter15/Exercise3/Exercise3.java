import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String inputString1;
    String inputString2;
    int dotCounter;

    System.out.println("First word:");
    inputString1 = scan.nextLine();
    System.out.println("Second word:");
    inputString2 = scan.nextLine();

    dotCounter = 30 - (inputString1.length() + inputString2.length());

    System.out.print(inputString1);
    while (dotCounter > 0) {
      System.out.print(".");
      dotCounter = dotCounter - 1;
    }
    System.out.print(inputString2);

  }
}
