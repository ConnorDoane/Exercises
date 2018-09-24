import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);

    String name;
    int strength;
    int health;
    int luck;

    System.out.println("Welcome to Yertle's Quest");
    System.out.println("Enter the name of your character:");
    name = scan.nextLine();
    System.out.println("Enter the Strength value (1-10)");
    strength = scan.nextInt();
    System.out.println("Enter the Health value (1-10)");
    health = scan.nextInt();
    System.out.println("Enter the Luck value (1-10)");
    luck = scan.nextInt();

    if(strength + health + luck > 15) {
      strength = 5;
      health = 5;
      luck = 5;

      System.out.println("You have given your character too many points! Default Values have been assigned:");
    }

    System.out.println(name + ": Strength: " + strength + " Health: " + health + " Luck: " + luck);

  }
}
