package br.com.leandersonandre.javafx.exemplos.layout.menulateral;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    ListView<String> listView;

    @FXML
    Label label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> items = FXCollections.observableArrayList("Em andamento", "Finalizado", "Favoritos","Abandonados","2018","2017","2016");

        listView.getItems().addAll(items);

        listView.setStyle("-fx-control-inner-background:  #343F4B;");


    }

    @FXML
    public void handleMouseClick(MouseEvent event) {
        label.setText(listView.getSelectionModel().getSelectedItem());
    }

}
