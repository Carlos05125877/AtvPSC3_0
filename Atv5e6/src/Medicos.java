import java.util.ArrayList;
import java.util.Scanner;

public class Medicos{
    private static ArrayList<Medicos> listaMedicos = new ArrayList<>();

    private String nomeMedico;
    private String crm;
    private String especialidade;
    private String telefone;
    private String periodoAtendimento;

    public Medicos(String nomeMedico, String crm, String especialidade, String telefone, String periodoAtendimento) {

        this.nomeMedico = nomeMedico;
        this.crm = crm;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.periodoAtendimento = periodoAtendimento;
    }

    public static void cadastrarMedico(){
        Scanner sc = new Scanner(System.in);

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

        Medicos medico = new Medicos(nomeMedico, crm, especialidade, telefone, periodoAtendimento);
        listaMedicos.add(medico);
        System.out.println("CADASTRO REALIZADO!");
    }

    public static void listarMedico(){
        if (listaMedicos.isEmpty()) {
            System.out.println("Nenhum médico cadastrado!");
            return;
        }

        System.out.println("\nLISTA DE MÉDICOS CADASTRADOS:");
        for (Medicos medico : listaMedicos) {
            System.out.println("--------------------");
            System.out.println("Nome: " + medico.getNomeMedico());
            System.out.println("CRM: " + medico.getCrm());
            System.out.println("Especialidade: " + medico.getEspecialidade());
            System.out.println("Telefone: " + medico.getTelefone());
            System.out.println("Período de Atendimento: " + medico.getPeriodoAtendimento());

    }
}

    private String getPeriodoAtendimento() {
        return periodoAtendimento;
    }

    private String getTelefone() {
        return telefone;
    }

    private String getEspecialidade() {
        return especialidade;
    }

    private String getCrm() {
        return crm;
    }

    private String getNomeMedico() {
        return nomeMedico;

    }
    }
