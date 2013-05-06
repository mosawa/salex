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
public class SupplierController implements Initializable {
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField addressNumberTextField;
    @FXML
    private TextField AddressStreetTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextField mobileTextField;
    @FXML
    private TextField notesTextField;
    @FXML
    private TextField faxTextField;
    @FXML
    private ComboBox<?> towncomboBox;
    @FXML
    private Button updateBotton;
    @FXML
    private Button deleteBotton;
    @FXML
    private Button clearBotton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoName(ActionEvent event) {
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
    }

    @FXML
    private void gototown(ActionEvent event) {
    }

    @FXML
    private void gotoPhoneNumber(ActionEvent event) {
    }

    @FXML
    private void gotoMobile(ActionEvent event) {
    }

    @FXML
    private void gotoNotes(ActionEvent event) {
    }

    @FXML
    private void gotoFax(ActionEvent event) {
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
}
