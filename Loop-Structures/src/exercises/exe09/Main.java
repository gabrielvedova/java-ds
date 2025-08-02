package exercises.exe09;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 13, 2, 10};

        System.out.println("Números multiplicados por 2:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
            System.out.println(nums[i]);
        }
    }
}