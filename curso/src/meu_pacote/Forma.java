package meu_pacote;

public class Forma {

    private double area;

    public void calcularArea(int lado1,int lado2){
        this.area = lado1 * lado2;
    }

    public void calcularArea(int raio){
        this.area = Math.PI * Math.pow(raio,2);
        System.out.println("Area = "+this.area);
    }
}
