/*Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada.
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida. Nesse caso, o programa deverá mostrar uma mensagem.
 */


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int opcao =0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu de opções:\n" +
                    "1. Média aritmética\n" +
                    "2. Média ponderada\n" +
                    "3. Sair\n" +
                    "Digite a opção desejada.");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Aritmetica.realizarMedia();
                    break;
                case 2:
                    Ponderada.realizarMedia();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcão inválida!!!");
            }
        }while(opcao!=3);
    }
}

