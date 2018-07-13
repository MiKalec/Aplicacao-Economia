package br.com.ch.address.main;

import br.com.ch.address.model.ControladoraMicro;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    ControladoraMicro cmicro = new ControladoraMicro();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../views/MicroFunctionPage.fxml"));
        primaryStage.setTitle("Bora vê");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
        cmicro.initializeList();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
