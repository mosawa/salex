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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import salex.SuperController;
import salex.ent.ItemType;
import salex.ent.Supplier;

/**
 * FXML Controller class
 *
 * @author Thillina Ranathunga
 */
public class ItemViewController extends SuperController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private TextField brandTextField;
    @FXML
    private TextField minimunLimitTextField;
    @FXML
    private ComboBox<Supplier> supplierComboBox;
    @FXML
    private ComboBox<ItemType> typeComboBox;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fillSupplierComboBox();
        fillTypeComboBox();
    }

    @FXML
    private void gotoDescription(ActionEvent event) {
        descriptionTextField.requestFocus();
    }

    @FXML
    private void gotoBrand(ActionEvent event) {
        brandTextField.requestFocus();
    }

    @FXML
    private void gotoSupplier(ActionEvent event) {
        supplierComboBox.requestFocus();
    }

    @FXML
    private void gotoUpdate(ActionEvent event) {
        updateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String description = descriptionTextField.getText().trim();
        String brand = brandTextField.getText().trim();
        supplierComboBox.getSelectionModel().getSelectedItem();
    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
        codeTextField.setText("");
        descriptionTextField.setText("");
        brandTextField.setText("");
        minimunLimitTextField.setText("");


    }

    @FXML
    private void gotoMinimumLimit(ActionEvent event) {
    }

    private void fillSupplierComboBox() {
        supplierComboBox.setItems(FXCollections.observableList(manager.find(Supplier.class)));
    }

    private void fillTypeComboBox() {
        typeComboBox.setItems(FXCollections.observableList(manager.find(ItemType.class)));
    }
}
