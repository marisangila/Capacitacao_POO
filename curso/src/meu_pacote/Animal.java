package meu_pacote;

public class Animal {
    private String nome;
    private String cor;
    private String pelagem;
    private double peso;
    private int idade;
    private String especie;

    private boolean comendo;
    private boolean dormindo;

    public void comer(){
        this.comendo = true;
        System.out.println("Estou comendo!");
    }
    public void dormir(){
        this.dormindo = true;
        System.out.println("ZZzzzZZzZzzZ...");
    }
}
