import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
        int totalPessoas = 0;

        while (true) {
            System.out.print("Digite o número do canal (4, 5, 7, 12) ou 0 para encerrar: ");
            int canal = sc.nextInt();


            if (canal == 0) {
                break;
            }

            System.out.print("Digite o número de pessoas assistindo este canal: ");
            int pessoas = sc.nextInt();


            switch (canal) {
                case 4:
                    canal4 += pessoas;
                    break;
                case 5:
                    canal5 += pessoas;
                    break;
                case 7:
                    canal7 += pessoas;
                    break;
                case 12:
                    canal12 += pessoas;
                    break;
                default:
                    System.out.println("Canal inválido. Escolha entre 4, 5, 7 ou 12.");
                    continue;
            }
            totalPessoas += pessoas;
        }


        if (totalPessoas > 0) {
            System.out.println("Porcentagem de audiência de cada canal:");
            System.out.printf("Canal 4: %.2f%%\n", (canal4 * 100.0) / totalPessoas);
            System.out.printf("Canal 5: %.2f%%\n", (canal5 * 100.0) / totalPessoas);
            System.out.printf("Canal 7: %.2f%%\n", (canal7 * 100.0) / totalPessoas);
            System.out.printf("Canal 12: %.2f%%\n", (canal12 * 100.0) / totalPessoas);
        } else {
            System.out.println("Nenhuma audiência registrada.");
        }

    }
}
