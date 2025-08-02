package exercises.exe08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = { "João", "Maria", "José", "Ana", "Pedro" };

        System.out.print("Digite um nome: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (String n : names) {
            if (n.equals(name)) {
                System.out.println("Nome está na lista");
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Nome não está na lista");


        scanner.close();
    }
}