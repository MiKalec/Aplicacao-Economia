package br.com.ch.address.model;

import br.com.ch.address.model.concepts.Concepts;
import br.com.ch.address.model.concepts.Demanda;
import br.com.ch.address.model.concepts.Elasticidade;
import br.com.ch.address.model.concepts.Oferta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.ComboBox;
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

    @FXML
    private ComboBox<String> conceptsComboBox;
    private ObservableList<String> conceptsObservableList = FXCollections.observableArrayList();

    public void initializeComboBox(String conceito) {
        switch(conceito) {
            case "Oferta":
                conceptsComboBox.getItems().addAll(
                        "Preço",
                        "Imposto",
                        "Cond. natural"
                );

            case "Demanda":
                conceptsComboBox.getItems().addAll(
                        "Preço",
                        "Renda"
                );

            case "Elasticidade" :
                conceptsComboBox.getItems().addAll(
                        "Preço-Demanda"
                );
        }
    }

}
