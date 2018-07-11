package br.com.ch.address.model.concepts;

public class PIB {
    private double valor;
    private double pibNominal;
    private double pibReal;
    //outros atributos e métodos

    public PIB(double valor) {
        this.valor = valor;
    }

    public calculaPibR(){

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
