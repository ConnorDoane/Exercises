import java.lang.Math;

public class Exercise1 {
  public static void main(String[] args) {
    for (int t = 0; t < 25; t++) {
      if(220/(1+10 * Math.pow(0.83, t)) >= 80) {
        System.out.println("After " + t + " years");
        break;
      }
    }
  }
}
