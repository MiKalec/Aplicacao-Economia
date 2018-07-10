package br.com.ch.address.model.atores;

import br.com.ch.address.model.concepts.Imposto;
import br.com.ch.address.model.concepts.PIB;
import br.com.ch.address.model.concepts.PNB;

import java.util.ArrayList;
import java.util.List;

public class Governo {
    private PIB pib;
    private PNB pnb;
    private List<Imposto> impostos= new ArrayList<>();
    private Double valorMoeda;
}
