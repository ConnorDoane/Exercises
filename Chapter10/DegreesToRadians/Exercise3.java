public class Exercise3 {
    public static void main(String[] args) {
        double angle = 30 * (Math.PI/180);
        double sinValue = Math.sin(angle);
        double cosValue = Math.cos(angle);
        double squareValue = (sinValue * sinValue) + (cosValue * cosValue);
        System.out.println("Sine: " + sinValue + " Cosine: " + cosValue + " Sum of Squares: " + squareValue);
    }
}
