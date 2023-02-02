package meu_pacote;

public class Potencia {
    
    private static final int QUADRADO = 2;

    public double calcularPotencia(double base){
        return Math.pow(base,QUADRADO);
    }
        
    public double calcularPotencia(double base, double expoente){
        return Math.pow(base,expoente);
    }
}
