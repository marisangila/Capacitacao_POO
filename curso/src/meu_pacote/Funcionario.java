package meu_pacote;

import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.YearMonth;

public class Funcionario{
    //atributos
    private String nome;
    private String cpf;
    private int anoAdmissao;
    private double salario;
    private String cnpj;

    private Scanner input = new Scanner(System.in);

    public Funcionario(String nome, String cpf, int anoAdmissao, double salario){
        this.nome = nome;    
        this.cpf = cpf;
        this.anoAdmissao = anoAdmissao;
        this.salario = salario;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    //métodos
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    /* 
    public void cadastrarFuncionario(String nome, String cpf,int anoAdmissao, double salario, String cnpj){
        this.nome = nome;    
        this.cpf = cpf;
        this.anoAdmissao = anoAdmissao;
        this.salario = salario;
        this.setCnpj(cnpj);
    }
    public void cadastrarFuncionario(String nome, String cpf,int anoAdmissao, double salario){
        this.nome = nome;    
        this.cpf = cpf;
        this.anoAdmissao = anoAdmissao;
        this.salario = salario;
    }*/
    public void calcularAjusteSalario(){
        System.out.println("Digite o percentual do aumento:");
        double percentual = input.nextDouble();
        this.salario = this.salario + (this.salario * percentual);
    }
    public void calcularAjusteSalario(double percentual){
        setSalario(getSalario() + (getSalario() * percentual));
    }

    public void calcularTempoEmpresa(){
        int anoAtual = YearMonth.now().getYear();
        int tempoEmpressa = anoAtual - this.anoAdmissao;
        System.out.println("O tempo de empresa é:"+tempoEmpressa);
    }
    public void visualizarFuncionario(){
        System.out.println("Dados do Funcionário");
        System.out.println("nome:"+nome);
        System.out.println("cpf:"+cpf);
        System.out.println("ano admissao:"+anoAdmissao);
        System.out.println("salario:"+salario);
    }
    public void inserirFuncionario(String nome, String cpf, int anoAdmissao, double salario){
        Conexao conexao = new Conexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "INSERT INTO funcionario (nome,cpf_,anoAdmissao,salario) VALUES('')";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
        }
    }
    public void inserirFuncionario(String nome, String cpf, String cnpj, int anoAdmissao, double salario){
        Conexao conexao = new Conexao();
        try {
            Statement stmt = conexao.createStatement();
            String sql = "INSERT INTO funcionario (nome,cpf_,anoAdmissao,salario) VALUES('')";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
        }
    }
}