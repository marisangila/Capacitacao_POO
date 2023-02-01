package meu_pacote;

import java.util.Scanner;
import java.time.YearMonth;

public class Funcionario{
    //atributos
    private String nome;
    private String cpf;
    private int anoAdmissao;
    private double salario;

    private Scanner input = new Scanner(System.in);

    //métodos
    public void cadastrarFuncionario(){
        System.out.println("Digite o nome:");
        nome = input.nextLine();
        System.out.println("Digite o cpf:");
        cpf = input.nextLine();
        System.out.println("Digite o ano admissao:");
        anoAdmissao = input.nextInt();
        System.out.println("Digite o salário:");
        salario = input.nextDouble();
    }

    public void calcularAjusteSalario(){
        System.out.println("Digite o percentual do aumento:");
        double percentual = input.nextDouble();
        double novoSalario = this.salario + (this.salario * percentual);
    }
    public void calcularTempoEmpresa(){
        int anoAtual = YearMonth.now().getYear();
        int tempoEmpressa = anoAtual - this.anoAdmissao;
        System.out.println("O tempo de empresa é:"+tempoEmpressa);
    }
    public void visualizarFuncionario(){
        System.out.println("Dados cadastrados");
        System.out.println("nome:"+nome);
        System.out.println("cpf:"+cpf);
        System.out.println("ano admissao:"+anoAdmissao);
        System.out.println("salario:"+salario);
    }
}