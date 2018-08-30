package br.com.leandersonandre.javafx.exemplos.acoes.ocultarcomponentes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputControl;


public class Controller {

    @FXML
    public CheckBox checkBox;

    @FXML
    public TextInputControl input;

    public void onButtonClick(ActionEvent event) {
        input.setVisible(checkBox.isSelected());
    }

}
