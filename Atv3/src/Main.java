/*Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:
• a média das idades das dez pessoas;
• o total que possui superior a 90 kg e altura inferior a 1,50 metro;
• a porcentagem de pessoas com idade entre 10 e 30 anos entre aquelas que medem mais de
1,90 m;
• uma opção para apresentar todos os dados coletados

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contPessoa = 0;
        int idade;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            contPessoa++;
            System.out.printf("Digite a idade da %dº pessoa", contPessoa);
            idade = sc.nextInt();
        }

    }
}