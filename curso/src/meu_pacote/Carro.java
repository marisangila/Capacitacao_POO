package meu_pacote;

public class Carro {
    
    private String cor;
    private String modelo;
    private String placa;
    private boolean estado = false;

    public void acelerar(){

    }
    public void frear(){

    }
    public void ligar(){
        this.estado = true;
    }
    public void desligar(){
        this.estado = false;
    }

}
