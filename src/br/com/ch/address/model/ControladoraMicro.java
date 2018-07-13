package br.com.ch.address.model;

import br.com.ch.address.model.concepts.Concepts;
import br.com.ch.address.model.concepts.Demanda;
import br.com.ch.address.model.concepts.Elasticidade;
import br.com.ch.address.model.concepts.Oferta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;


@SuppressWarnings("all")
public class ControladoraMicro {
    Oferta oferta = new Oferta();
    Demanda demanda = new Demanda();
    Elasticidade elasticidade = new Elasticidade();

    @FXML
    private ListView<Concepts> conceitos;
    private ObservableList<Concepts> listViewData = FXCollections.observableArrayList();

    public void initializeList(){
        listViewData.add(oferta);
        listViewData.add(demanda);
        listViewData.add(elasticidade);

        conceitos.setItems(listViewData);
    }



}
