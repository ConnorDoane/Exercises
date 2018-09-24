import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int count;
    double total = 0;
    double cubeTotal = 0;

    System.out.println("What number?");
    count = scan.nextInt();

    while (count > 0) {
      total += (count * count);
      cubeTotal += (count * count * count);

      count -= 1;
    }

    System.out.println("Square: " + total + "  Cube: " + cubeTotal);

  }
}
