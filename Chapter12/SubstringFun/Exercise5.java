import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    String inString;
    int inBegin;
    int inEnd;

    //inputs
    System.out.println("Enter a String");
    inString = scan.nextLine();
    System.out.println("Enter the beginning index:");
    inBegin = scan.nextInt();
    System.out.println("Enter the ending index:");
    inEnd = scan.nextInt();

    String newString = inString.substring(inBegin, inEnd);

    System.out.println("Your original string was " + inString + " and the new Substring is " + newString);
  }
}
