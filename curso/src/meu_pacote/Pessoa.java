package meu_pacote;

public class Pessoa { 
    protected String nome;
    protected int idade;
    protected String nascimento;

    public Pessoa(String nome, int idade,String nascimento){
        this.nome = nome;
        this.idade = idade;
        this.nascimento = nascimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
    public String getNascimento(){
        return this.nascimento;
    }

    public void falar(){
        System.out.println("oi!");
    }

    public void falarAlgumaCoisa(){
        System.out.println("eu sou uma pessoa!");
    }

}
