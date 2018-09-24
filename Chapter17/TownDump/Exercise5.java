import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int pounds;
    int price;

    System.out.println("How many pounds of trash are you disposing of? Round to the nearest whole number");
    pounds = scan.nextInt();

    if (pounds <= 200) {
      price = 20;
    } else {
      pounds = pounds - 200;
      price = 20 + (8 * (pounds / 100));
    }

    System.out.println("disposal will cost " + price);
  }
}
