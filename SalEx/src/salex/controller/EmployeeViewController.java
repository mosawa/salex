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
    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
    }

    @FXML
    private void gotoFirstName(ActionEvent event) {
    }

    @FXML
    private void gotoLastName(ActionEvent event) {
    }

    @FXML
    private void gotoPosition(ActionEvent event) {
    }

    @FXML
    private void gotoMobile(ActionEvent event) {
    }

    @FXML
    private void gotoCity(ActionEvent event) {
    }

    @FXML
    private void gotoFixedLine(ActionEvent event) {
    }

    @FXML
    private void gotoNotes(ActionEvent event) {
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
    }
}
