import java.util.Scanner;


class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao=0;

        do{
            System.out.println("-------MENU------");
            System.out.println("1.Cadastro de Médicos");
            System.out.println("2.Cadastro de Pacientes");
            System.out.println("3.Visualizar Medicos");
            System.out.println("4.Visualizar Pacientes");
            System.out.println("5.Sair\n");
            System.out.println("Escolha uma opção:");
            opcao=sc.nextInt();




            switch(opcao){
                case 1:
                    Medicos.cadastrarMedico();
                    break;
                case 2:
                    // cadastro paciente

                    System.out.println("Cadastro de Pacientes");
                    break;
                case 3:
                    // agendamento

                    System.out.println("Lista de Medicos");
                    break;
                case 4:
                    // agendamento
                    System.out.println("Lista de Pacientes");
                case 5:
                    // sair
                    System.out.println("Saindo......");
                default:
                    System.out.println("Opção inválida.");

            }
        }while(opcao != 5);




    }
}
