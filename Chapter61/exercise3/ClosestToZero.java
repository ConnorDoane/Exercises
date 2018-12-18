import java.lang.Math;

public class ClosestToZero {
  public static void main(String[] args) {
    int[] data = {3,1,5,7,4,12,-3,8,-2};

    int closest = data[0];
    int location = 0;

    for (int i = 1; i < data.length; i++) {
      if (Math.abs(data[i]) < closest) {
        closest = data[i];
        location = i;
      }
    }

    System.out.println("Closest number is " + closest + " located at index " + location);
  }
}