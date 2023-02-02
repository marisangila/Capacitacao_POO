package meu_pacote;

public class Controle {
    
    private String marca;
    private int tamanho;
    private boolean estado = false;
    private int volume = 10;
    private int canal = 1;

    public void ligar(){
        this.estado = true;
    }
    public void desligar(){
        this.estado = false;
    }
    public void aumentarVolume(){
        this.volume++;
    }
    public void reduzirVolume(){
        this.volume--;
    }
    public void trocarCanal(int novoCanal){
        this.canal = novoCanal;
    }
}
