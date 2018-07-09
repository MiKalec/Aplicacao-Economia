package br.com.ch.address.model.concepts;

import br.com.ch.address.interfaces.Concept;

public class Demanda implements Concept {
    private Oferta oferta = new Oferta();
    @Override
    public void aumenta(){
        oferta.reduz();
    }

    @Override
    public void reduz(){
        oferta.aumenta();
    }
}
