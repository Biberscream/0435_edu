public class Main {
    public static void main(String[] args) {
        int[] num = {1, 84, 3, 64, 12, 8, 7, 9, 2, 1};
        int max = 0;
        for (int i = 1; i <num.lenght; i++) {
            if (max < num[i]) max = num[i];
        }
        System.out.print("Max number:  "+max);
    }
}
