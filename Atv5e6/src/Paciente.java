import java.util.ArrayList;
import java.util.Scanner;
public class Paciente {
    private static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private String nomePaciente;
    private String dataNascimento;
    private String telefone;
    private String endereco;

    public Paciente() {
    }

    public Paciente(String nomePaciente, String dataNascimento, String telefone, String endereco) {
        this.nomePaciente = nomePaciente;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

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

        Paciente paciente = new Paciente(nomePaciente, dataNascimento, telefone, endereco);
        listaPacientes.add(paciente);

        System.out.println("CADASTRO REALIZADO!");
    }
    public static void ListaPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("Nenhum médico cadastrado!");
            return;
        }

        System.out.println("\nLISTA DE MÉDICOS CADASTRADOS:");
        for (Paciente paciente : listaPacientes) {
            System.out.println("--------------------");
            System.out.println("Nome: " + paciente.getNomePaciente());
            System.out.println("CRM: " + paciente.getDataNascimento());
            System.out.println("Telefone: " + paciente.getTelefone());
            System.out.println("Período de Atendimento: " + paciente.getEndereco());

        }
    }



    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
}
