package main.java.exercises.exe04;

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantas notas deseja inserir: ");
        int n = scanner.nextInt();

        double[] notes = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a "+(i+1)+"° nota: ");
            double note = scanner.nextDouble();
            notes[i] = note;
        }
        scanner.close();
        System.out.println("Media das notas: " + media(notes));
    }

    public static double media(double[] notes) {
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.length;
    }
}
