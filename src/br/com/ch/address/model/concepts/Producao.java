package br.com.ch.address.model.concepts;

@SuppressWarnings("all")
public class Producao{
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
        lucroEsperadoPorcentagem = (lucroEsperadoPorcentagem / 100);
        lucroEsperadoPorcentagem = lucroEsperadoPorcentagem + 1.0;
        this.valor = (custo + despesa) * lucroEsperadoPorcentagem;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public void aumentaCusto(Double porcentagem){
        porcentagem = porcentagem / 100;
        porcentagem = porcentagem + 1.0;
        this.custo = custo * porcentagem;
    }

    public void reduzCusto(Double porcentagem){
        porcentagem = porcentagem / 100;
        porcentagem = 1.0 - porcentagem;
        this.custo = custo * porcentagem;
    }

    public void aumentaValor(Double porcentagem){
        porcentagem = porcentagem / 100;
        porcentagem = porcentagem + 1.0;
        this.valor = valor * porcentagem;
    }

    public void reduzValor(Double porcentagem){
        porcentagem = porcentagem / 100;
        porcentagem = 1.0 - porcentagem;
        this.valor = valor * porcentagem;
    }

    public void aumenta(Double porcentagem) {

    }

    public void reduz(Double porcentagem) {

    }
}
