import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("Para acessar a atividade que deseja, basta digitar o número do exercício (1 - 12)");
            System.out.println("Caso queira encerrar, basta digitar o número 0 no input");
            int question = scanner.nextInt();

            int a, b, c, num;
            char sex;

            switch (question) {
                case 0:
                    System.out.println("Saindo...");
                    break loop;
                case 1:
                    System.out.println("Digite os valores de A, B e C:");
                    System.out.print("A: ");
                    a = scanner.nextInt();
                    System.out.print("B: ");
                    b = scanner.nextInt();
                    System.out.print("C: ");
                    c = scanner.nextInt();

                    boolean result = exe01(a, b, c);

                    if (result) System.out.println("A + B é menor que C");
                    break;
                case 2:
                    System.out.println("Digite o sexo (M/F) e o estado civil (solteiro/casado/viúvo):");
                    System.out.print("Sexo: ");
                    sex = scanner.next().charAt(0);
                    System.out.print("Estado civil: ");
                    String maritalStatus = scanner.next().toLowerCase();

                    String result2 = exe02(sex, maritalStatus, scanner);
                    System.out.println(result2);
                    break;
                case 3:
                    System.out.println("Digite um número para verificar se é par ou ímpar:");
                    num = scanner.nextInt();

                    boolean isEven = exe03(num);
                    System.out.println("O número " + num + (isEven ? " é par." : " é ímpar."));
                    break;
                case 4:
                    System.out.println("Digite dois números inteiros: ");
                    System.out.print("A: ");
                    a = scanner.nextInt();
                    System.out.print("B: ");
                    b = scanner.nextInt();

                    c = exe04(a, b);
                    System.out.println("O resultado é: " + c);
                    break;
                case 5:
                    System.out.println("Digite um número inteiro:");
                    num = scanner.nextInt();

                    int result5 = exe05(num);
                    System.out.println("O resultado é: " + result5);
                    break;
                case 6:
                    System.out.println("Digite dois valores booleanos (true/false):");
                    System.out.print("Valor 1: ");
                    boolean isTrue1 = scanner.nextBoolean();
                    System.out.print("Valor 2: ");
                    boolean isTrue2 = scanner.nextBoolean();

                    boolean result6 = exe06(isTrue1, isTrue2);
                    System.out.println(isTrue1 + " + " + isTrue2 + " = " + result6);
                    break;
                case 7:
                    System.out.println("Digite um número inteiro:");
                    num = scanner.nextInt();

                    int result7 = exe07(num);
                    System.out.println("O resultado é: " + result7);
                    break;
                case 8:
                    System.out.println("Digite três números inteiros:");
                    System.out.print("A: ");
                    a = scanner.nextInt();
                    System.out.print("B: ");
                    b = scanner.nextInt();
                    System.out.print("C: ");
                    c = scanner.nextInt();

                    Integer[] descendingNumbers = exe08(a, b, c);
                    System.out.println("Números em ordem decrescente: " + Arrays.toString(descendingNumbers));
                    break;
                case 9:
                    System.out.println("Digite a altura e o sexo (M/F):");
                    System.out.print("Altura (m): ");
                    double height = scanner.nextDouble();
                    System.out.print("Sexo (M/F): ");
                    sex = scanner.next().charAt(0);

                    double result9 = exe09(height, sex);
                    if (result9 != -1) {
                        System.out.printf("O peso ideal é: %.2f kg%n", result9);
                    }
                    break;
                case 10:
                    System.out.println("Digite o peso e a altura:");
                    System.out.print("Peso (kg): ");
                    double weight = scanner.nextDouble();
                    System.out.print("Altura (m): ");
                    height = scanner.nextDouble();

                    String result10 = exe10(weight, height);
                    System.out.println("Classificação do IMC: " + result10);
                    break;
                case 11:
                    System.out.println("Digite o preço do produto e o método de pagamento de acordo com a tabela abaixo:");
                    System.out.println("1 - Dinheiro (10% de desconto)\n" +
                                       "2 - Cartão de crédito (15% de desconto)\n" +
                                       "3 - Parcelado em duas vezes sem juros\n" +
                                       "4 - Parcelado em duas vezes com juros (10% de juros)");
                    System.out.print("Preço: R$ ");
                    double price = scanner.nextDouble();
                    System.out.print("Método de pagamento (1-4): ");
                    int paymentMethod = scanner.nextInt();

                    double finalPrice = exe11(price, paymentMethod);
                    System.out.printf("O preço final é: R$ %.2f%n", finalPrice);
                    break;
                case 12:
                    System.out.println("Digite quatro notas (0-100):");
                    int[] scores = new int[4];
                    for (int i = 0; i < 4; i++) {
                        if (i != 3) {
                            System.out.print("Nota " + (i + 1) + ": ");
                        } else {
                            System.out.print("Nota da média de exercícios: ");
                        }
                        scores[i] = scanner.nextInt();
                    }

                    char grade = exe12(scores);
                    System.out.println("A nota final é: " + grade);
                    break;
                default:
                    System.out.println("Comando incorreto!");
            }
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println();

        }
        System.out.println("Volte sempre!");
        scanner.close();
    }

    public static boolean exe01 (int a, int b, int c) {
        return a + b < c;
    }

    public static String exe02 (char sex, String maritalStatus, Scanner scanner) {
        if (sex == 'F' && maritalStatus.equals("casada")) {
            System.out.println("Digite quanto tempo está casada:");
            int years = scanner.nextInt();

            return "Seu marido tem sorte em te ter por perto por " + years + " anos.";
        } else {
            return "Por hoje é só!";
        }
    }
    public static boolean exe03(int num) {
        return num % 2 == 0;
    }

    public static int exe04(int a, int b) {
        if (a == b) {
            return a + b;
        } else {
            return a * b;
        }
    }
    public static int exe05 (int num) {
        if (num >= 0) {
            return num * 2;
        } else {
            return num * 3;
        }
    }
    public static boolean exe06(boolean isTrue1, boolean isTrue2) {
        return isTrue1 && isTrue2;
    }
    public static int exe07(int num) {
        boolean isEven = exe03(num);
        if (isEven) {
            return num + 5;
        } else {
            return num + 8;
        }
    }
    public static Integer[] exe08(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Integer[] descendingNumber = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(descendingNumber, Collections.reverseOrder());

        return descendingNumber;
    }
    public static double exe09(double height, char sex) {
        if ( sex == 'M') {
            return (72.7 * height) - 58;
        } else if (sex == 'F') {
            return (62.1 * height) - 44.7;
        } else {
            System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            return -1; // Retorna -1 para indicar erro
        }
    }

    // Exercício 10

    public static double IMC(double weight, double height) {
        return weight / (height * height);
    }
    public static String exe10(double weight, double height) {
        double imc = IMC(weight, height);
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    // Exercício 11

    public static double exe11(double price, int paymentMethod) {
        double discount = 1;
        switch (paymentMethod) {
            case 1: // Dinheiro
                discount -= 0.1;
                break;
            case 2: // Cartão de crédito
                discount -= 0.15;
                break;
            case 3: // Parcelado em duas vezes sem juros
                discount = 1;
                break;
            case 4: // Parcelado em duas vezes com juros
                discount += 0.1;
                break;
            default:
                System.out.println("Método de pagamento inválido.");
                return price;
        }
        return price * discount;

    }

    public static char exe12(int[] scores) {
        double average = (scores[0] + scores[1]*2 + scores[2]*3 + scores[3]) / 7.0;
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
