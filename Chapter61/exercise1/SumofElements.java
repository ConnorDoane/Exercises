public class SumofElements {
  public static void main(String[] args) {
    int[] data = {3,2,5,7,9,12,97,24,54};

    int all = 0;
    int even = 0;
    int odd = 0;

    for(int i = 0; i < data.length; i++) {
      all += data[i];
      if (i%2 == 0) {
        even += data[i];
      } else {
        odd += data[i];
      }
    }

    System.out.println(all);
    System.out.println(even);
    System.out.println(odd);
  }
}
