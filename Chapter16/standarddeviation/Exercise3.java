import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;
    int count;
    double currentNum;
    double avg = 0;
    double squareAvg = 0;

    System.out.println("How many numbers will you input");
    n = scan.nextInt();

    count = n;

    while (count > 0) {
      currentNum = scan.nextDouble();
      avg = avg + currentNum;
      squareAvg = squareAvg + (currentNum * currentNum);
      count -= 1;
    }

    avg = avg / n;
    squareAvg = squareAvg / n;

    System.out.println("The Standard Deviation: " + Math.sqrt( squareAvg - (avg * avg)));

  }
}
