package br.com.ch.address.model.atores;

import br.com.ch.address.model.concepts.Imposto;
import br.com.ch.address.model.concepts.Producao;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String tipo;
    private Producao producao;
    private List<Imposto> impostos = new ArrayList<>();
}
