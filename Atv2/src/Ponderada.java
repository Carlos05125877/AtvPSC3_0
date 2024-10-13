import java.util.Scanner;

public class Ponderada{
    private double nota1;
    private double nota2;
    private double nota3;
    private double peso1;
    private double peso2;
    private double peso3;

    public static void realizarMedia(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        double peso1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite o peso da segunda nota: ");
        double peso2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite o peso da terceira nota: ");
        double peso3 = sc.nextDouble();


        double media = (peso1*nota1)+(peso2*nota2)+(peso3*nota3)/(peso1+peso2+peso3);

        System.out.println(media);
    }

}
