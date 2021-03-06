public class TwoLargest {
  public static void main(String[] args) {
    int[] data = {3,1,5,7,4,12,-3,8,-2};
    int firstLargest = 0;
    int secondLargest = 0;

    for (int i = 0; i < data.length; i++) {
      if (data[i] > firstLargest) {
        firstLargest = data[i];
      } else if (data[i] > secondLargest) {
        secondLargest = data[i];
      }
    }

    System.out.println("FIRST: " + firstLargest);
    System.out.println("SECOND: " + secondLargest);
  }
}
