package br.com.ch.address.model;

import br.com.ch.address.model.concepts.Demanda;
import br.com.ch.address.model.concepts.Elasticidade;
import br.com.ch.address.model.concepts.Oferta;

@SuppressWarnings("all")
public class CalculadoraMicro {
    Oferta oferta = new Oferta();
    Demanda demanda = new Demanda();
    Elasticidade elasticidade = new Elasticidade();

    public String getOfertaDemanda(){
        //mostra gráfico de oferta e demanda
        return "Oferta e demanda se relacionam de maneiras opostas," +
                " se uma diminui, é natural que a outra aumente. O ponto" +
                " de cruzamento das duas retas é o chamado ponto de equilíbrio.";
    }
}
