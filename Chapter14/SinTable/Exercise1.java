import java.text.*;

public class Exercise1 {
  public static void main(String[] args) {
    double angle = -90.0;
    double radians;

    DecimalFormat df = new DecimalFormat("##.######");

    System.out.println("Angle       Sine");
    System.out.println("-----       ----");

    for (; angle <= 90.0; angle = angle + 15.0) {
      double ang = angle * (Math.PI/180);

      //alignment
      if(ang < 0.0)
        System.out.println(angle + "       " + df.format(Math.sin(ang)));
      else if(ang == 0.0)
        System.out.println("  " + angle + "        " + df.format(Math.sin(ang)));
      else
        System.out.println(" " + angle + "        " + df.format(Math.sin(ang)));
    }
  }
}
