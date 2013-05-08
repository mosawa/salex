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

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class EmployeeViewController implements Initializable {
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button clearButton;
    @FXML
    private TextField addressNumberTextField;
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField addressStreetTextField;
    @FXML
    private TextField mobileTextField;
    @FXML
    private TextField fixedLineTextField;
    @FXML
    private TextField notesTextField;
    @FXML
    private ComboBox<?> positionComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void update(ActionEvent event) {
        String code = codeTextField.getText().trim();
        String name = firstNameTextField.getText().trim();
        String lastname = lastNameTextField.getText().trim();
        positionComboBox.getSelectionModel().getSelectedItem();
        String address = addressNumberTextField.getText().trim();
        String addressstreet = addressStreetTextField.getText().trim();
        String city = cityTextField.getText().trim();
        String mobile = mobileTextField.getText().trim();
        String fix = fixedLineTextField.getText().trim();
        String note = notesTextField.getText().trim();
        
        
    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
     addressStreetTextField.requestFocus();
    }

    @FXML
    private void gotoFirstName(ActionEvent event) {
        firstNameTextField.requestFocus();
    }

    @FXML
    private void gotoLastName(ActionEvent event) {
        lastNameTextField.requestFocus();
    }

    @FXML
    private void gotoPosition(ActionEvent event) {
        positionComboBox.requestFocus();
    }

    @FXML
    private void gotoMobile(ActionEvent event) {
        mobileTextField.requestFocus();
    }

    @FXML
    private void gotoCity(ActionEvent event) {
        cityTextField.requestFocus();
    }

    @FXML
    private void gotoFixedLine(ActionEvent event) {
        fixedLineTextField.requestFocus();
    }

    @FXML
    private void gotoNotes(ActionEvent event) {
        notesTextField.requestFocus();
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
        addressNumberTextField.requestFocus();
    }
}
