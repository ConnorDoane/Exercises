import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a word: ");
    String word = scan.nextLine();
    int counter = 0;

    while (counter < word.length()) {
      System.out.println(word.charAt(counter));
      counter ++;
    }
  }
}
