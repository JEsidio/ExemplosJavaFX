package br.com.leandersonandre.javafx.exemplos.layout.tableview;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public TableView tableView;


    private final ObservableList<User> data =
            FXCollections.observableArrayList(
                    new User(1, "User a","surname a", "a@example.com"),
                    new User(2, "User b", "surname b","b@example.com"),
                    new User(3, "User c", "surname c","c@example.com"),
                    new User(4, "User d", "surname d","d@example.com"),
                    new User(5, "User e", "surname e","e@example.com")
            );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableView.setItems(data);
    }
}
