package br.com.leandersonandre.javafx.exemplos.acoes.obtervalorcampotexto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputControl;


public class Controller {
    @FXML
    public Label label;
    @FXML
    public TextInputControl input;

    public void onButtonClick(ActionEvent event) {
        label.setText("Você digitou: "+input.getText());
    }

}
