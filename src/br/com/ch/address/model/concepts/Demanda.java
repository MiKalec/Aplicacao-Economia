package br.com.ch.address.model.concepts;

import br.com.ch.address.interfaces.Concept;

public class Demanda implements Concept {
    private Oferta oferta = new Oferta();
    @Override
    public void aumenta(Double porcentagem){

    }

    @Override
    public void reduz(Double porcentagem){

    }
}
