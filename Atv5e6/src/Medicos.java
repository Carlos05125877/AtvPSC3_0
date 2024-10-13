import java.util.Scanner;

public class Medicos{
    public static void cadastrarMedico(){
        Scanner sc = new Scanner(System.in);
        //Medico novoMedico = new Medico();

        System.out.println("Nome Completo:");
        String nomeMedico = sc.nextLine();
        System.out.println("CRM:");
        String crm = sc.nextLine();
        System.out.println("Especialidade:");

        String especialidade = sc.nextLine();
        System.out.println("Telefone:");
        String telefone = sc.nextLine();
        System.out.println("Periodo de Atendimento:");
        String periodoAtendimento = sc.nextLine();


        System.out.println("CADASTRO REALIZADO!");
    }
}
