package meu_pacote;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Func extends Pessoa{

    private String matricula;
    public Departamento departamento;
    private double salario;
    private double bonus = 500;

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
    public Func(String nome, int idade, String nascimento) {
        super(nome, idade, nascimento);
    }

    public void trabalhar(){
        System.out.println(this.getNome()+"está trabalhando!");
    }

    public void calcularSalario(double comissao, double salario){
        this.setSalario(salario);
        double novoSalario = this.getSalario() + comissao;
        System.out.println("seu salário com comissão é:"+novoSalario);
    }

    public void calcularSalario(double salario){
        this.setSalario(salario);
        System.out.println("seu salário é:"+this.getSalario());
    }
    @Override
    public void falarAlgumaCoisa(){
        System.out.println("eu sou um funcionário!");
    }
    @Override
    public void falar(){
        System.out.println("olá");
    }

    public void inserirFuncionario(){
        Connection conexao = null;
        PreparedStatement comando = null;
        try {
            conexao = Conexao.Conectar();
            String sql = "INSERT INTO funcionario (nome,idade,nascimento,salario) VALUES(?,?,?,?)";
            comando = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            comando.setString(1,this.getNome());
            comando.setInt(2,this.getIdade());
            comando.setString(3,this.getNascimento());
            comando.setDouble(4,this.salario);

            comando.executeUpdate();
        } catch (SQLException e) {
        }
    }    
}
