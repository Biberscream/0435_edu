public class Main {
    public static void main(String[] args) {
        int[] nums = {5,3,9,4,87,6};
        int min = nums[0];
        for (int i = 1; i < 6; i++) {
            if (min>nums[i]) min = nums[i];
        }
        System.out.println(min);
    }

