package br.com.ch.address.model;

import br.com.ch.address.model.concepts.Concepts;
import br.com.ch.address.model.concepts.Demanda;
import br.com.ch.address.model.concepts.Elasticidade;
import br.com.ch.address.model.concepts.Oferta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class ControladoraMicro {
    Oferta oferta = new Oferta();
    Demanda demanda = new Demanda();
    Elasticidade elasticidade = new Elasticidade();

    private List<Concepts> listView;

    private ObservableList<Concepts> listViewData = FXCollections.observableArrayList();





}
