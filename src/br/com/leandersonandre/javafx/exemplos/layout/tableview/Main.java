package br.com.leandersonandre.javafx.exemplos.layout.tableview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Carrega a Tela
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("br/com/leandersonandre/javafx/exemplos/layout/tableview/tela.fxml"));
        // Atribui o título da Janela
        primaryStage.setTitle("Exemplo de Tabela");
        // Atribui o tamanho da Janela
        primaryStage.setScene(new Scene(root));
        // Exibe a Janela
        primaryStage.show();
    }


    public static void main(String[] args) {
        // Método para inicializar a tela
        launch(args);
    }
}
