package Funcionario_oo;

import meu_pacote.Func;

public class App {
    public static void main(String[] args) {  

        Func fulana = new Func("mari", 1001, "19/05/0000");
        fulana.calcularSalario(1000.00, 500.00);
        fulana.calcularSalario(1000.00);
        System.out.println(fulana.getSalario());
        fulana.falarAlgumaCoisa();
        fulana.falar();

        //Erro.exibeErro();
        //String x = Erro.mensagem;

        fulana.inserirFuncionario();

    }
}
