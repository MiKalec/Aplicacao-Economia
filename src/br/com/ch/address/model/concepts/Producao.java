package br.com.ch.address.model.concepts;

import br.com.ch.address.interfaces.Concept;

public class Producao implements Concept {
    private Double custo;
    private Double valor;
    private Imposto imposto;

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custoMateriaPrima, Imposto imposto, Double custoMaoDeObra) {
        this.custo = (custoMateriaPrima + custoMaoDeObra) * imposto.getValorPorcentagem();
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double lucroEsperadoPorcentagem, Double custo, Double despesa) {
        lucroEsperadoPorcentagem = lucroEsperadoPorcentagem /100;
        lucroEsperadoPorcentagem = lucroEsperadoPorcentagem + 1.0;
        this.valor = (custo + despesa) * lucroEsperadoPorcentagem;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    @Override
    public void aumenta() {

    }

    @Override
    public void reduz() {

    }

    public void aumentaCusto(){

    }

    public void reduzCusto(){

    }

    public void aumentaValor(){

    }

    public void reduzValor(){

    }
}
