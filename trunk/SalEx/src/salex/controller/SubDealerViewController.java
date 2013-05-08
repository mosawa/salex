package salex.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class SubDealerViewController extends SuperController  implements Initializable {
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField ownerTextField;
    @FXML
    private TextField addressNumberTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private ComboBox<?> townComboBox;
    @FXML
    private Button UpdateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TextField addressStreetTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoName(ActionEvent event) {
        NameTextField.requestFocus();
    }

    @FXML
    private void gotoOwner(ActionEvent event) {
        ownerTextField.requestFocus();
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
        addressNumberTextField.requestFocus();
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
        addressStreetTextField.requestFocus();
    }

    @FXML
    private void gotoUpdate(ActionEvent event) {
        UpdateButton.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String name = NameTextField.getText().trim();
        String owner = ownerTextField.getText().trim();
        String Addressnumber = addressNumberTextField.getText().trim();
        String addressstreet = addressStreetTextField.getText().trim();
        
                
                
        
    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
    }

    @FXML
    private void gotoTown(ActionEvent event) {
    }
}
