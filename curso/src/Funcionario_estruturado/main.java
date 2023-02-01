package Funcionario_estruturado;
import java.time.YearMonth;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {  

        String nome;
        String cpf;
        int anoAdmissao;
        double salario;
        int opcao;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome:");
        nome = input.nextLine();
        System.out.println("Digite o cpf:");
        cpf = input.nextLine();
        System.out.println("Digite o ano de admissao:");
        anoAdmissao = input.nextInt();
        System.out.println("Digite o salário:");
        salario = input.nextDouble();
        
        visualizarFuncionario(nome, cpf, anoAdmissao, salario);

        System.out.println("Escolha uma opção:");
        System.out.println("[1] Ajustar Salário");
        System.out.println("[2] Obter tempo de empresa:");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                salario = calcularAjusteSalario(salario);
            break;
            case 2:
                calcularTempoEmpresa(anoAdmissao);
            break;
            default:
            System.out.println("Opção Inválida!");
        }

        visualizarFuncionario(nome, cpf, anoAdmissao, salario);
        
    }

    public static void visualizarFuncionario(String nome, String cpf, int anoAdmissao, double salario){
        System.out.println("Dados cadastrados");
        System.out.println("nome:"+nome);
        System.out.println("cpf:"+cpf);
        System.out.println("ano admissao:"+anoAdmissao);
        System.out.println("salario:"+salario);
    }

    public static  void calcularTempoEmpresa(int anoAdmissao){
        int anoAtual = YearMonth.now().getYear();
        int tempoEmpressa = anoAtual - anoAdmissao;
        System.out.println("O tempo de empresa é:"+tempoEmpressa);
    }

    public static double calcularAjusteSalario (double salario){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o percentual do aumento:");
        double percentual = input.nextDouble();
        double novoSalario = salario + (salario * percentual);

        return novoSalario;
    }
}
