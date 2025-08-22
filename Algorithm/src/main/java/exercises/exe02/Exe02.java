package main.java.exercises.exe02;
import java.util.Scanner;
import java.util.Arrays;

public class Exe02 {
    public static void main(String[] args) {
        int[] seats = new int[10];
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Menu");
            System.out.println("1 - Reservar poltrona");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Verificar poltronas disponíveis");
            System.out.println("4 - Sair");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Digite o número da poltrona: ");
                    int seat = scanner.nextInt();
                    if(seat < 1 || seat > 10) {
                        System.out.println("Poltrona inválida");
                        break;
                    }
                    reservSeat(seats, seat);
                    break;
                case 2:
                    System.out.println("Digite o número da poltrona: ");
                    int seatCancel = scanner.nextInt();
                    if(seatCancel < 1 || seatCancel > 10) {
                        System.out.println("Poltrona inválida");
                        break;
                    }
                    cancelReserv(seats, seatCancel);
                    break;
                case 3:
                    System.out.println(Arrays.toString(seats));
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;

            }
        }
    }

    public static void reservSeat(int[] seats, int seat) {
        if(seats[seat-1] == 1) System.out.println("Poltrona já reservada");
        else seats[seat-1] = 1;
    }

    public static void cancelReserv(int[] seats, int seat) {
        if (seats[seat-1] == 0) System.out.println("Poltrona não reservada");
        else seats[seat-1] = 0;
    }
}
