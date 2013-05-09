/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import salex.SuperController;
import salex.ent.Bank;
import salex.ent.Town;

/**
 * FXML Controller class
 *
 * @author J.Sandun
 */
public class TownViewController extends SuperController implements Initializable {

    MainController mainController = MainController.getInstance();
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TableView<Town> townTableView;
    @FXML
    private TableColumn<Town, String> codeTableColumn;
    @FXML
    private TableColumn<Town, String> nameTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeColumns();
        fillTable();
    }

    @FXML
    private void gotoName(ActionEvent event) {
        nameTextField.requestFocus();
    }

    @FXML
    private void gotoUpdate(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String code = codeTextField.getText().trim();
        String name = nameTextField.getText().trim();
         if (code.equals("") || name.equals("")) {
            return;
        }
        Town town = new Town(code);
        town.setName(name);
        manager.update(town);
        clear(event);
        
        
        
        
    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        nameTextField.setText("");
        codeTextField.requestFocus();
        fillTable();

    }

    private void fillTable() {
        townTableView.setItems(FXCollections.observableList(manager.find(Town.class)));
    }

    private void makeColumns() {
        codeTableColumn.setCellValueFactory(
                new PropertyValueFactory<Town, String>("code"));
        nameTableColumn.setCellValueFactory(
                new PropertyValueFactory<Town, String>("name"));
    }
}
