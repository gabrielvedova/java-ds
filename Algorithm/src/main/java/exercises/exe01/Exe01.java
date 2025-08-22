package main.java.exercises.exe01;
import java.util.Scanner;
import java.util.Arrays;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Números de votos totais: ");
        int totalVotes = scanner.nextInt();
        int[] votes = new int[6];

        for (int i = 0; i < totalVotes; i++) {
            System.out.println("Voto: ");
            int vote = scanner.nextInt();
            registerVotes(votes, vote);
        }
        scanner.close();
        int[] winners = getWinner(votes);

        System.out.println("Votos para o candidato 1: " + votes[0]);
        System.out.println("Votos para o candidato 2: " + votes[1]);
        System.out.println("Votos para o candidato 3: " + votes[2]);
        System.out.println("Votos para o candidato 4: " + votes[3]);
        System.out.println("Votos para o candidato 5: " + votes[4]);
        System.out.println("Votos nulos: " + votes[5]);
        System.out.println("Vencedor(es): " + Arrays.toString(winners));

    }

    public static void registerVotes(int[] votes, int candidate) {
        if (candidate < 1 || candidate > 5) {
            votes[5] += 1;
        } else {
            votes[candidate-1] += 1;
        }
    }

    public static int[] getWinner(int[] votes) {
        int[] winners = {};
        for (int i = 0; i < votes.length - 1; i++) {
            if (votes[i] == getMax(votes)) {
                winners = Arrays.copyOf(winners, winners.length + 1);
                winners[winners.length - 1] = i + 1;
            }
        }
        return winners;
    }

    public static int getMax(int[] votes) {
        int max = votes[0];
        for (int i = 1; i < votes.length - 1; i++) {
            if (votes[i] > max) {
                max = votes[i];
            }
        }
        return max;
    }
}
