/* Fazer um algoritmo, utilizando o comando for, que calcule e escreva a soma dos 50 primeiros
termos da seguinte série: S = 1000/1 − 997/2 + 994/3 − 991/4 + . .

 */
public class Main {
    public static void main(String[] args) {
        double s = 1000;
        double resultado = 0.0;
        int sinal = 1;


        for(int i = 1; i<=50; i++){
            resultado += (s/i)*sinal;
            s=s-3;
            sinal *= -1;
        }
        System.out.printf ("%.2f \n", resultado);

    }
}