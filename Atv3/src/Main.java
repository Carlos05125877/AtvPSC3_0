/*Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:
• a média das idades das dez pessoas;
• o total que possui superior a 90 kg e altura inferior a 1,50 metro;
• a porcentagem de pessoas com idade entre 10 e 30 anos entre aquelas que medem mais de
1,90 m;
• uma opção para apresentar todos os dados coletados

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalPessoas = 10;
        int somaIdades = 0;
        int pessoasAbaixo150Acima90 = 0;
        int pessoasEntre10e30Mais190 = 0;

        List<Integer> idades = new ArrayList<>();
        List<Double> pesos = new ArrayList<>();
        List<Double> alturas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < totalPessoas; i++) {
            System.out.printf("Digite a idade da %dº pessoa: ", i + 1);
            int idade = sc.nextInt();
            idades.add(idade);
            somaIdades += idade;

            System.out.printf("Digite o peso da %dº pessoa: ", i + 1);
            double peso = sc.nextDouble();
            pesos.add(peso);

            System.out.printf("Digite a altura da %dº pessoa: ", i + 1);
            double altura = sc.nextDouble();
            alturas.add(altura);


            if (peso > 90 && altura < 1.5) {
                pessoasAbaixo150Acima90++;
            }
            if (idade >= 10 && idade <= 30 && altura > 1.9) {
                pessoasEntre10e30Mais190++;
            }
        }

        double mediaIdades = (double) somaIdades / totalPessoas;

        double porcentagemAltosEntre10e30 = (double) pessoasEntre10e30Mais190 / totalPessoas * 100;


        System.out.printf("Média das idades: %.2f\n", mediaIdades);
        System.out.printf("Total de pessoas com mais de 90kg e menos de 1,50m: %d\n", pessoasAbaixo150Acima90);
        System.out.printf("Porcentagem de pessoas com idade entre 10 e 30 anos e mais de 1,90m: %.2f%%\n", porcentagemAltosEntre10e30);


        System.out.println("\nDados de todas as pessoas:");
        for (int i = 0; i < totalPessoas; i++) {
            System.out.printf("Pessoa %d: Idade = %d, Peso = %.2f kg, Altura = %.2f m\n", i + 1, idades.get(i), pesos.get(i), alturas.get(i));
        }
    }
}