public class BoxTester {
  public static void main(String[] args) {
    Box box = new Box(5.0);
    System.out.println(box.volume());
    System.out.println(box.surfaceArea());
    Box newBox = new Box(box);
    System.out.println(newBox.volume());
    System.out.println(newBox.surfaceArea());
  }
}
