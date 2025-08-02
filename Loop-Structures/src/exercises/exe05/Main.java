package exercises.exe05;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Números pares:");
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}