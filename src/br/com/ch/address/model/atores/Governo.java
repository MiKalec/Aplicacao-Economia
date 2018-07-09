package br.com.ch.address.model.atores;

import br.com.ch.address.model.concepts.Imposto;

import java.util.ArrayList;
import java.util.List;

public class Governo {
    private PIB pib;
    private PNB pnb;
    private List<Imposto> impostos= new ArrayList<>();
    private Double valorMoeda;
}
