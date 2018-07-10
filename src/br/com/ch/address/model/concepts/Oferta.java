package br.com.ch.address.model.concepts;

import br.com.ch.address.interfaces.Concept;

public class Oferta implements Concept {
    Demanda demanda = new Demanda();
    @Override
    public void aumenta(Double porcentagem) {

    }

    @Override
    public void reduz(Double porcentagem) {

    }
}
