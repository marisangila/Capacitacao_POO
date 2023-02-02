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
        
        nome = "fulano";
        cpf = "12345678910";
        anoAdmissao =  2020;
        salario = 20500.99;

        Funcionario pessoa1 = new Funcionario();
        pessoa1.cadastrarFuncionario(nome, cpf, anoAdmissao, salario);
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