package br.com.ch.address.model.concepts;

public class Elasticidade {
    private final String definicao = "Elasticidade mede a variação percentual de uma variável X " +
            "dado uma variação percentual de uma variável Y.";

    public String getDefinicao() {
        //mostra fórmula de elasticidade
        return definicao;
    }

    public String getElasticidadePrecoDemanda(){
        //plota img
        return "Elasticidade Preço-Demanda, mede a variação percentual da demanda de um bem dado a " +
                "variação do seu preço. Quando o preço diminui a demanda aumenta, segundo a elasticidade";
    }
}
