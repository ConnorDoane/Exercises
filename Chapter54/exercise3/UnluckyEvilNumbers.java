import java.util.Scanner;

public class UnluckyEvilNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int oneCounter = 0;
    int zeroCounter = 0;

    System.out.println("Input a number to see if it's unlikely and evil");
    int input = scan.nextInt();
    int storedInput = input;

    while(input != 0) {
      if (input % 10 == 3) {
        if ((input / 10) % 10 == 1) {
          unlucky = true;
        }
      }
      input /= 10;
    }
    if(unlucky) {
      while (storedInput != 0) {
        if (storedInput % 2 == 1) {
          oneCounter++;
        } else {
          zeroCounter++;
        }
        storedInput /= 2;
      }
      if (oneCounter % 2 == 0) {
        System.out.println("This number is Evil AND Unlucky!!");
      } else {
        System.out.println("This number is Unlucky, but it is NOT evil!");
      }
    } else {
      System.out.println("This number is NOT unlucky!");
    }
  }
}
