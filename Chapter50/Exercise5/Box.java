public class Box {
  private double width;
  private double height;
  private double length;

  public Box(double width, double height, double length) {
    this.width = width;
    this.height = height;
    this.length = length;
  }

  public Box(double side) {
    this.width = side;
    this.height = side;
    this.length = side;
  }

  public Box(Box oldBox) {
    this.width = oldBox.getWidth();
    this.height = oldBox.getHeight();
    this.length = oldBox.getHeight();
  }

  //GETTERS
  public double getWidth() {
    return this.width;
  }
  public double getHeight() {
    return this.height;
  }
  public double getLength() {
    return this.length;
  }

  //PRIVATE METHODS
  private double faceArea() {
    return this.length * this.height;
  }

  private double sideArea() {
    return this.width * this.height;
  }

  private double topArea() {
    return this.length * this.width;
  }

  //PUBLIC METHODS
  public double volume() {
    return this.width * this.height * this.length;
  }
  public double surfaceArea() {
    return topArea() * 2 + sideArea() * 2 + faceArea() * 2;
  }

  public Box biggerBox(Box oldBox) {
    return new Box(1.25*oldBox.getWidth(), 1.25*oldBox.getHeight(), 1.25*oldBox.getLength());
  }
  public Box smallerBox(Box oldBox) {
    return new Box(0.75*oldBox.getWidth(), 0.75*oldBox.getHeight(), 0.75*oldBox.getLength());
  }

  public boolean nests(Box outsideBox) {
    if (this.height <= outsideBox.getHeight() && this.length <= outsideBox.getLength() && this.width <= outsideBox.getWidth()) {
      return true;
    } else {
      return false;
    }
  }

}
