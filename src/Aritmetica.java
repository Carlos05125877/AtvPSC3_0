import java.util.Scanner;

public class Aritmetica {
    private double nota1;
    private double nota2;
    private double media;



    public static void realizarMedia() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2)/2;

        System.out.println(media);


    }
}



