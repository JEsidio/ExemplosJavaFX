package br.com.leandersonandre.javafx.exemplos.acoes.duploclicknoregistrotableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

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

        addButtonToTable();

    }
    private void addButtonToTable() {
        TableColumn<User, Void> colBtn = new TableColumn("");

        Callback<TableColumn<User, Void>, TableCell<User, Void>> cellFactory = new Callback<TableColumn<User, Void>, TableCell<User, Void>>() {
            @Override
            public TableCell<User, Void> call(final TableColumn<User, Void> param) {
                final TableCell<User, Void> cell = new TableCell<User, Void>() {

                    private final Button btn = new Button("Action");

                    {
                        btn.setOnAction((ActionEvent event) -> {
                            User data = getTableView().getItems().get(getIndex());
                            System.out.println("selectedData: " + data);
                        });
                    }

                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(btn);
                        }
                    }
                };
                return cell;
            }
        };

        colBtn.setCellFactory(cellFactory);

        tableView.getColumns().add(colBtn);

    }

    public void duploClick(MouseEvent mouseEvent) {
        if (mouseEvent.isPrimaryButtonDown() && mouseEvent.getClickCount() == 2) {
            User user =  (User) tableView.getSelectionModel().getSelectedItem();
            System.out.println(user);
        }
    }
}
