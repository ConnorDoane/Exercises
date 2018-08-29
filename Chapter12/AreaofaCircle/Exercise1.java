import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    String inData;

    System.out.println("Enter the Radius of the Circle: ");
    inData = scan.nextLine();

    double inNumber = Double.parseDouble(inData);

    double area = (inNumber * inNumber * Math.PI);

    System.out.println("if the Radius is " + inNumber + ", the area is: " + area);
  }
}
