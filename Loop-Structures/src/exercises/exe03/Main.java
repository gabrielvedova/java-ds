package exercises.exe03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 5 notas separadas por espaço: ");
        String[] notes = scanner.nextLine().split(" ");

        double sum = 0;
        for (String note : notes) {
            double value = Double.parseDouble(note);
            sum += value;
        }
        double average = sum / notes.length;
        System.out.printf("A média das notas é: %.2f%n", average);

        scanner.close();
    }
}