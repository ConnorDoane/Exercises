import java.util.Scanner;

public class PasswordChecker {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean upperCase = false;
    boolean lowerCase= false;
    boolean number = false;

    String password;

    while (!upperCase || !lowerCase || !number) {
      upperCase = false;
      lowerCase = false;
      number = false;
      System.out.println("Please enter a potential Password:");
      password = scan.nextLine();

      if(password.length() > 7) {
        for (int i = 0; i < password.length(); i++) {
          if (Character.isUpperCase(password.charAt(i))) {
            upperCase = true;
          } else if (Character.isLowerCase(password.charAt(i))) {
            lowerCase = true;
          } else if (Character.isDigit(password.charAt(i))) {
            number = true;
          }
        }
      }
    }

    System.out.println("That password works!");

  }
}
