package Funcionario_oo;

import java.util.Scanner;
import meu_pacote.*;

public class App {
    public static void main(String[] args) {  

        String nome;
        String cpf;
        int anoAdmissao;
        double salario;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome:");
        nome = input.nextLine();
        System.out.println("Digite o cpf:");
        cpf = input.nextLine();
        System.out.println("Digite o ano admissao:");
        anoAdmissao = input.nextInt();
        System.out.println("Digite o salário:");
        salario = input.nextDouble();

        Funcionario pessoa1 = new Funcionario();
        pessoa1.cadastrarFuncionario(nome,cpf,anoAdmissao,salario);
        pessoa1.visualizarFuncionario();
        pessoa1.calcularAjusteSalario();
        pessoa1.calcularTempoEmpresa();

        Funcionario pessoa2 = new Funcionario();

        Professor fulano = new Professor();

        fulano.cadastrarFuncionario(nome, cpf, anoAdmissao, salario);
        fulano.visualizarFuncionario();
        System.out.println("Informe a disciplina:");
        String disciplina = input.nextLine();
        fulano.inserirDisciplina(disciplina);



    }

        
    
}
7777