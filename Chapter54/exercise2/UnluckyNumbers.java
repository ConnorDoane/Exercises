import java.util.Scanner;

public class UnluckyNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    boolean unlucky = false;

    System.out.println("Input a number to see if it's unlikely");
    int input = scan.nextInt();

    while(input != 0) {
      if (input % 10 == 3) {
        if ((input / 10) % 10 == 1) {
          unlucky = true;
        }
      }
      input /= 10;
    }
    if(unlucky) {
      System.out.println("This number is unlucky!");
    } else {
      System.out.println("This number is NOT unlucky!");
    }
  }
}
