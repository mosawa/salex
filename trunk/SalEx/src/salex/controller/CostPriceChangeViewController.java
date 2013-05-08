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
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class CostPriceChangeViewController implements Initializable {
    @FXML
    private ComboBox<?> itemComboBox;
    @FXML
    private Button processButton;
    @FXML
    private HBox dateHbox;
    @FXML
    private TextField costPriceTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoCostPrice(ActionEvent event) {
        costPriceTextField.requestFocus();
    }

    @FXML
    private void process(ActionEvent event) {
        String cost = costPriceTextField.getText().trim();
        itemComboBox.getSelectionModel().getSelectedItem();
    }

    @FXML
    private void fillTable(ActionEvent event) {
    }
}
