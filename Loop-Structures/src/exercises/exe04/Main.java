package exercises.exe04;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 11, 4, 15, 2, 32 };
        int num_bigger_than_10 = 0;

        for (int num : nums) {
            if (num > 10) {
                num_bigger_than_10++;
            }
        }
        System.out.println("Quantidade de números maiores que 10: " + num_bigger_than_10);

    }
}