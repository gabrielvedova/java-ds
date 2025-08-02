package exercises.exe07;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[7];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);

        System.out.println("Maior número da lista: " + nums[nums.length - 1]);
        scanner.close();
    }
}