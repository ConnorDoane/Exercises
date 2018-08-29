public class Exercise2 {
    public static void main(String[] args) {
        double angle = 0.5236;
        double sinValue = Math.sin(angle);
        double cosValue = Math.cos(angle);
        double squareValue = (sinValue * sinValue) + (cosValue * cosValue);
        System.out.println("Sine: " + sinValue + " Cosine: " + cosValue + " Sum of Squares: " + squareValue);
    }
}
