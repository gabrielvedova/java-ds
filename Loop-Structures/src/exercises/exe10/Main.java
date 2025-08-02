package exercises.exe10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        int nums_even = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            nums[i] = scanner.nextInt();
            if (nums[i] % 2 == 0) nums_even++;
        }

        System.out.println("Quantidade de números pares: " + nums_even);
        System.out.println("Quantidade de números ímpares: " + (nums.length - nums_even));

        scanner.close();
    }
}