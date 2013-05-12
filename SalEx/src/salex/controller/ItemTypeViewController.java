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
import javafx.scene.input.InputEvent;
import salex.SuperController;
import salex.ent.Bank;
import salex.ent.ItemType;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ItemTypeViewController extends SuperController implements Initializable {

    @FXML
    private TextField typeTextield;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TableView<ItemType> itemTypeTablView;
    @FXML
    private TableColumn<ItemType, String> typeTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeColumns();
        fillTable();
    }

    private void fillTable() {
        itemTypeTablView.setItems(FXCollections.observableList(manager.find(ItemType.class)));
    }

    private void makeColumns() {
        typeTableColumn.setCellValueFactory(
                new PropertyValueFactory<ItemType, String>("type"));
    }

    @FXML
    private void fill(InputEvent event) {
        ItemType itemType = itemTypeTablView.getSelectionModel().getSelectedItem();
        typeTextield.setText(itemType.getType());
    }

    private void gotoUpDateButton(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String type = typeTextield.getText().trim();
    }

    @FXML
    private void delete(ActionEvent event) {
        manager.delete(itemTypeTablView.getSelectionModel().getSelectedItem());
        clear(event);
    }

    @FXML
    private void clear(ActionEvent event) {
        typeTextield.setText("");
        fillTable();

    }
    
}
