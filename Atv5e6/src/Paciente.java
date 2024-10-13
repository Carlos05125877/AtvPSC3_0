import java.util.Scanner;

class Paciente {

    private int idPaciente;
    private String nomePaciente;
    private String dataNascimento;
    private String telefone;
    private String endereco;

    public static void cadastrarPaciente(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome Completo:");
        String nomePaciente = sc.nextLine();
        System.out.println("Data de Nascimento:");
        String dataNascimento = sc.nextLine();
        System.out.println("Telefone:");
        String telefone = sc.nextLine();
        System.out.println("Endereço:");
        String endereco = sc.nextLine();


        System.out.println("CADASTRO REALIZADO!");
    }

}
