package br.com.ch.address.model.concepts;

public class PNB {

    public final String definicao = "PNB remete a soma de valor de produtos, bens e serviços sociais do país e levando em conta somente o que é"
            + "produzido dentro deste território nacional excluindo então importações e serviços estrangeiros durante um certo período.";
    private double valor;
    //outros atributos e métodos

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
