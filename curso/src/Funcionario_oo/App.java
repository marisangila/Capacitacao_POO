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

        Funcionario pessoa1 = new Funcionario(nome, cpf, anoAdmissao, salario);
        Professor fulano = new Professor(nome,cpf,anoAdmissao,salario);
        fulano.visualizarFuncionario();
        fulano.inserirDisciplina("Matemática");
    }
}
