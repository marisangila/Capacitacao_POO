package Funcionario_oo;

import meu_pacote.Funcionario;

public class main {
    public static void main(String[] args) {  
        Funcionario pessoa1 = new Funcionario();
        pessoa1.cadastrarFuncionario();
        pessoa1.visualizarFuncionario();
        pessoa1.calcularAjusteSalario();
        pessoa1.calcularTempoEmpresa();

        Funcionario pessoa2 = new Funcionario();
        pessoa2.cadastrarFuncionario();

    }
}
