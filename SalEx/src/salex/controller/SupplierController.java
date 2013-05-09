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
import salex.SuperController;

/**
 * FXML Controller class
 *
 * @author Anuradha
 */
public class SupplierController extends SuperController implements Initializable {

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
        nameTextField.requestFocus();
    }

    @FXML
    private void gotoAddressNumber(ActionEvent event) {
        addressNumberTextField.requestFocus();
    }

    @FXML
    private void gotoAddressStreet(ActionEvent event) {
        AddressStreetTextField.requestFocus();
    }

    @FXML
    private void gototown(ActionEvent event) {
        towncomboBox.requestFocus();
    }

    @FXML
    private void gotoPhoneNumber(ActionEvent event) {
        phoneNumberTextField.requestFocus();
    }

    @FXML
    private void gotoMobile(ActionEvent event) {
        mobileTextField.requestFocus();
    }

    @FXML
    private void gotoNotes(ActionEvent event) {
        notesTextField.requestFocus();
    }

    @FXML
    private void gotoFax(ActionEvent event) {
        faxTextField.requestFocus();
    }

    @FXML
    private void update(ActionEvent event) {
        String name = nameTextField.getText().trim();
        String addressnumber = addressNumberTextField.getText().trim();
        String adressstreet = AddressStreetTextField.getText().trim();
        towncomboBox.getSelectionModel().getSelectedItem();
        String phonenumber = phoneNumberTextField.getText().trim();
        String mobile = mobileTextField.getText().trim();
        String notes = notesTextField.getText().trim();
        String fax = faxTextField.getText().trim();

    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
    }
}
