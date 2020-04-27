public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 84, 3, 64, 12, 8, 7, 9, 2, 1};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }
}
