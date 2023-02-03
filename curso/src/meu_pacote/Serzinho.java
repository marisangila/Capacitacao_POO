package meu_pacote;


public class Serzinho implements Ser{

    @Override
    public void falar(String mensagem){
        System.out.println(mensagem);
    }
    @Override
    public void andar(){
        System.out.println("Estou andando!");
    }
    @Override
    public void viver(){
        System.out.println("Estou vivo!");
    }

}
