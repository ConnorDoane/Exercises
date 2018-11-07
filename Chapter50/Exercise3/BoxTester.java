public class BoxTester {
  public static void main(String[] args) {
    Box box = new Box(5.0);
    System.out.println(box.volume());
    System.out.println(box.surfaceArea());
    Box biggerBox = box.biggerBox(box);
    System.out.println(biggerBox.volume());
    System.out.println(biggerBox.surfaceArea());
    Box smallerBox = box.smallerBox(box);
    System.out.println(smallerBox.volume());
    System.out.println(smallerBox.surfaceArea());
  }
}
