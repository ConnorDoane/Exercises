import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a word");
    String input = scan.nextLine();

    int counter = input.length();
    System.out.println(" ");

    while (counter > 0) {
      System.out.println(input);
      counter = counter - 1;
    }

    }
  }
