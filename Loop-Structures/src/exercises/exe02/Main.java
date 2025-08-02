package exercises.exe02;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        System.out.println("Soma: " + sum);
    }
}