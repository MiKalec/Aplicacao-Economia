package br.com.ch.address.model.concepts;

@SuppressWarnings("all")
public class Producao{
    private double custo;
    private double valor;
    private Imposto imposto;
    private Inflacao inflacao;

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custoMateriaPrima, Imposto imposto, double custoMaoDeObra) {
        this.custo = (custoMateriaPrima + custoMaoDeObra) * imposto.getValorPorcentagem();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double lucroEsperadoPorcentagem, double custo, double despesa) {
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

    public void aumentaCusto(double porcentagem){
        porcentagem = porcentagem / 100;
        porcentagem = porcentagem + 1.0;
        this.custo = custo * porcentagem;
    }

    public void reduzCusto(double porcentagem){
        porcentagem = porcentagem / 100;
        porcentagem = 1.0 - porcentagem;
        this.custo = custo * porcentagem;
    }

    public void aumentaValor(double porcentagem){
        porcentagem = porcentagem / 100;
        porcentagem = porcentagem + 1.0;
        this.valor = valor * porcentagem;
        inflacao.historico_de_precos.add(valor);
    }

    public void reduzValor(double porcentagem){
        porcentagem = porcentagem / 100;
        porcentagem = 1.0 - porcentagem;
        this.valor = valor * porcentagem;
        inflacao.historico_de_precos.add(valor);
    }

    public void aumenta(double porcentagem) {
        //implementar lógica de aumento de producao
    }

    public void reduz(double porcentagem) {
        //implementar lógica de reducao de producao
    }
}
