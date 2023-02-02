package meu_pacote;

public class Carro {
    
    private String cor;
    private String modelo;
    private String placa;
    private boolean estado;
    private int velocidade = 0;

    public void acelerar(){
        this.velocidade += 10;
    }
    public void frear(){
        this.velocidade -= 10;
    }
    public void ligar(){
        this.estado = true;
    }
    public void desligar(){
        this.estado = false;
    }

}
