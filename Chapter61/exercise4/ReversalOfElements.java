public class ReversalOfElements {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] result = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int count = 0;

        for (int i = data.length - 1; i >= 0; i--) {
            result[count] = data[i];
            count++;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}