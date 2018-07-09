package br.com.ch.address.model.concepts;

import br.com.ch.address.interfaces.Concept;

public class Oferta implements Concept {
    Demanda demanda = new Demanda();
    @Override
    public void aumenta() {
        demanda.reduz();
    }

    @Override
    public void reduz() {
        demanda.aumenta();
    }
}
