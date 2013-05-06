/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class ItemViewController implements Initializable {
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private TextField brandTextField;
    @FXML
    private TextField minimunLimitTextField;
    @FXML
    private ComboBox<?> supplierComboBox;
    @FXML
    private ComboBox<?> typeComboBox;
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
        // TODO
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
    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
    }

    @FXML
    private void gotoMinimumLimit(ActionEvent event) {
        
    }

    

       

   
}
